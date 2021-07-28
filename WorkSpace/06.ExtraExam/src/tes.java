import java.util.Scanner;

public class tes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coca = 800;
		int water = 500;
		int vitamin = 1500;
		int change = 0;
		int oneThousandWon, fiveHundredWon, oneHundredWon = 0;
		
		System.out.print("금액을 입력하세요. :");
		String money  = sc.nextLine();
		int money1 = Integer.parseInt(money);
		
		System.out.println("메뉴를 고르세요");
		System.out.print("1. 콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원) >>");
		String choice  = sc.nextLine();
		int choice1 = Integer.parseInt(choice);
		System.out.print(choice1);
		
		if(choice1==1 && money1>=coca) {
			change = money1-coca;
		} else if(choice1==2&&money1>=water) {
				change = money1-water;
		} else if(choice1==3&&money1>=vitamin) {
				change = money1-vitamin;
		} else {
				System.out.println("돈이 부족해요.");
		}

		while(change>0) {
		System.out.println("잔돈 : " + change + "원");
		oneThousandWon = change/1000;
		fiveHundredWon = change%1000/500; 
		oneHundredWon = change%1000%500/100;
		System.out.print("천원 : " + oneThousandWon + "개, ");
		System.out.print("오백원 : " + fiveHundredWon + "개, ");
		System.out.println("백원 : " + oneHundredWon + "개");
		break;
			}
		
	}
}
