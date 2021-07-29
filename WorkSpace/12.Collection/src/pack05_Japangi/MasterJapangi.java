package pack05_Japangi;
//자판기의 마스터 기능을 수행함

import java.util.ArrayList;

public class MasterJapangi {
	//method
	public ArrayList<DrinkDTO> mstJapangi(ArrayList<DrinkDTO> list){
		//main pg 에 있던 로직들이 여기에 있으면 된다.
		//-관리자의 로직이 끝나면 그결과를 List구조로 리턴을해서 메인
		//프로그램에서 사용할수있게만듬.
		DrinkDAO dao = new DrinkDAO();
		dao.display(list);
		String inputData = dao.rtnString();
		if (inputData.equals("1")) {
			System.out.println("관리자 모드 ");
			//음료의 추가 수정 삭제 조회
			//CRUD
			//CREATE(데이터의 추가) -list.add
			//Read(데이터의 조회)	-dao.display
			//Update(데이터의 수정)	-list.?
			//Delete(데이터의 삭제) -list.remove
			
			//1.데이터의 추가(음료추가) 
			System.out.println("1.음료 추가 2.음료 삭제 3. 음료 수정 4.음료 다시보기");
			inputData = dao.rtnString();
			if(inputData.equals("1")) {
				//음료 추가 로직을 구현 
				System.out.println("음료 추가 로직 시작");
				DrinkDTO dto = new DrinkDTO();
				//dto.name , price , compay = null , 0 , null
				System.out.println("음료의 이름을 입력해주세요");
				dto.setName( dao.rtnString() ) ;
				System.out.println("음료의 가격을 입력해주세요");
				dto.setPrice( dao.rtnInt() ) ;
				System.out.println("음료의 회사를 입력해주세요");
				dto.setCompany( dao.rtnString() ) ;
				list.add(dto);
				dao.display(list);
			}else if(inputData.equals("2")) {
				//음료 삭제 로직을 구현
				System.out.println("음료 삭제 시작");
				dao.display(list);//음료의 목록을 다시보여주고 해당하는 번호를 선택하게끔 유도
				System.out.println("삭제할 번호를 선택 하세요");
			
				list.remove( dao.rtnInt()-1 ) ;//음료 삭제 완료
				dao.display(list);
			}else if(inputData.equals("3")){
				//음료 수정 로직을 구현
				System.out.println("음료 수정 시작");
				System.out.println("수정할 번호를 선택 하세요");
				//inputData = sc.nextLine();
				
				System.out.println("음료의 이름을 입력해주세요.");
				
				list.get(dao.rtnInt()-1 ).setName(dao.rtnString() );
				dao.display(list);
				//..반복 처리 
			}
		}//관리자 모드 
		return list;
	}
}
