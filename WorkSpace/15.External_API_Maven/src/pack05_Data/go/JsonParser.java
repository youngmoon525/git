package pack05_Data.go;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;

public class JsonParser {
	public static void main(String[] args) {
		//json = key , value로 나누어진 데이터 자료 구조.
		//{  ,  } 중괄호 안에서 표현되고 , 대괄호 [ , ]는 하나의 Value 
		//중괄호는 우리가 사용하는 객체(DTO)같은 개념으로 이해를하면되고.
		//대괄호는 List,Array의 개념으로 이해를 하면 된다.
		//page=1&perPage=10&serviceKey=C%2Bs6aUnodQBsE9joWNITkbdNay8YjJkk%2BbBPEHHuPr63PvQcSd3PIPeYiH3aKgyOYMJQzI0RSm%2BLpIISoE03Sg%3D%3D
		//1.연결 
		String url = "https://api.odcloud.kr/api/3082925/v1/uddi:7c291067-a956-4811-a9ec-942b6979ff77_201709270816";
		//?=&=&=
		try {
			String jsonData = Jsoup.connect(url)
					.data("page" , "1")
					.data("perPage", "100")
					.data("serviceKey", "C+s6aUnodQBsE9joWNITkbdNay8YjJkk+bBPEHHuPr63PvQcSd3PIPeYiH3aKgyOYMJQzI0RSm+LpIISoE03Sg==")
					.timeout(3000)
					.userAgent("Chrome")
					.ignoreContentType(true)
					.execute()
					.body();
			System.out.println(jsonData);
			JSONParser jsonParser = new JSONParser();//JSONDATA 파싱을위한 객체
			JSONObject jsonObject =  (JSONObject) jsonParser.parse(jsonData);
			System.out.println(jsonObject);
			JSONArray foodArrayJson = (JSONArray) jsonObject.get("data");
			
			ArrayList<storeDTO> list = new ArrayList<>();
			for(int i = 0 ; i < foodArrayJson.size(); i++ ) {
				JSONObject jsonDTO = (JSONObject) foodArrayJson.get(i);
				list.add(new storeDTO(jsonDTO.get("연번").toString(),
						jsonDTO.get("연락처").toString(), 
						jsonDTO.get("주메뉴").toString(), 
						jsonDTO.get("상 호").toString(),
						jsonDTO.get("소재지").toString()
						) );
//				System.out.print("연번 : " + jsonDTO.get("연번") + "\t");
//				System.out.print("연락처 : " + jsonDTO.get("연락처") + "\t");
//				System.out.print("주메뉴 : " + jsonDTO.get("주메뉴") + "\t");
//				System.out.print("상 호 : " + jsonDTO.get("상 호") + "\t");
//				System.out.print("소재지 : " + jsonDTO.get("소재지") + "\t");
//				System.out.println();
				//ArrayList<MemberDTO> list ; <
				//MemberDTO dto = list.get(i)
				if(foodArrayJson.size()-1 == i) {
					display(list);
				}
			}
		}catch (Exception e) {
			System.out.println("J에러?");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		

	}//main
	
	private static void display(ArrayList<storeDTO> list) {
		for (storeDTO dto : list) {
			System.out.print("연번 : " + dto.getNo()  + "\t");
			System.out.print("연락처 : " + dto.getTel() + "\t");
			System.out.print("주메뉴 : " + dto.getMenu() + "\t");
			System.out.print("상 호 : " +  dto.getTitle() + "\t");
			System.out.print("소재지 : " + dto.getAddr() + "\t");
			System.out.println();
		}
		
	}

	public static class storeDTO{
		private String no ;
		private String tel ;
		private String menu ;
		private String title ;
		private String addr ;
		public storeDTO(String no, String tel, String menu, String title, String addr) {
			super();
			this.no = no;
			this.tel = tel;
			this.menu = menu;
			this.title = title;
			this.addr = addr;
		}
		public String getNo() {
			return no;
		}
		public void setNo(String no) {
			this.no = no;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getMenu() {
			return menu;
		}
		public void setMenu(String menu) {
			this.menu = menu;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		
		
	}
}
