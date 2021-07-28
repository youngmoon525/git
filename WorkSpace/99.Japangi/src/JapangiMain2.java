import java.util.Arrays;
import java.util.Scanner;

public class JapangiMain2 {
	public static void main(String[] args) {
		DrinkDAO dao = new DrinkDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("금액 입력");
		int inputNum = Integer.parseInt( sc.nextLine() ); 
		
		System.out.println("음료를 선택해 주세요. ");
		DrinkDTO[] dtos = new DrinkDTO[3];
		dtos[0] = new DrinkDTO(1, "콜라", 800);
		dtos[1] = new DrinkDTO(2, "쥬스", 600);
		dtos[2] = new DrinkDTO(3, "포카리", 1000);
		
		dao.getDisplay(dtos);//음료 목록을 보여줌
		
		int ichoose = Integer.parseInt( sc.nextLine() ); //1 , 2 , 3
		dao.chooseDrink(dtos, ichoose, inputNum);//음료 선택 및 완료 
	}
	
}
