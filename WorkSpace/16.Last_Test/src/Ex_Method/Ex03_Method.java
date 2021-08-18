package Ex_Method;

import java.util.ArrayList;

public class Ex03_Method {
	public static void main(String[] args) {
		ArrayList<UserDTO> list = rtnList();
		//UserDTO dto = list.get(0);
		Ex03_Method em = new Ex03_Method();
		em.display(list);

	}
	//내용을 보여주기만 하는 용도 (==return이 없다)
	public void display(ArrayList<UserDTO> list ) {
		//메뉴 
		for (int i = 0 ; i < list.size(); i ++) {
			System.out.println(list.get(i).getUserName() + "님 " + i);
		}
	}//
	
	//public static<=> 메소드타입(ArrayList) 메소드명
	public static ArrayList<UserDTO> rtnList(){ //==ArrayList<UserDTO> 
		ArrayList<UserDTO> list = new ArrayList<>();
		//UserDTO dto = new UserDTO("Name", "id", "pw", 10);
		list.add(new UserDTO("Name", "id", "pw", 10));
		list.add(new UserDTO("Name1", "id1", "pw1", 10));
		list.add(new UserDTO("Name2", "id2", "pw2", 10));
		list.add(new UserDTO("Name3", "id3", "pw3", 10));
		return list;
	}
}
