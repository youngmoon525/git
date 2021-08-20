package pack06_TestList;

import java.util.ArrayList;
import java.util.Scanner;

public class bookDAO {
	public void display(ArrayList<bookDTO> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getNum()+". "+ list.get(i).getName()+" / "+list.get(i).getAuthor()+" / "
					+list.get(i).getPublisher()+" / "+list.get(i).getPrice()+"원" );
		}
	}
	
	public String inputData() {
		Scanner sc = new Scanner(System.in);
		String inputData = "";
		while (true) {
			inputData = sc.nextLine();
			if (inputData.trim().length() > 0) {
				return inputData;
			}else {
				System.err.println("잘못된 입력입니다. 정확히 입력하세요.");
			}
		}
	}
	public int inputInt() {
		Scanner sc = new Scanner(System.in);
		int inputInt = 0;
		while (true) {
			try {
				inputInt = Integer.parseInt(sc.nextLine());
				return inputInt;
			} catch (Exception e) {
				System.err.println("숫자를 정확히 입력하세요.");
			}
		}
	}
	
	
	
	
	
}
