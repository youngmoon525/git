package pack02_TryCatch;

public class Ex03_TryCatch {
	public static void main(String[] args) {
		//1부터 100까지 누적합(sum)을 구하시오.
		//단 , 누적합이 777 이상이 되면 , 계산을 중지하고 결과를 출력
		int sum = 0;
		for(int i = 1 ; i<=100 ; i++ ) {//1부터 100까지
			sum += i;
			if (sum >= 777) {
				System.out.println("누적합이 777 이상이 되었습니다.");
				System.out.println("누적합 : " + sum + "  , i : " + i);
				break;//반복의 종료 
			}//if
		}//for
		//try~catch를 이용해서 강제로 예외 처리를 할수가있다.
		//강제로 예외처리는 throw 라는 객체를 통해서 한다.
		try {
			sum = 0;
			for (int i = 1; i <= 100; i++) {
				sum += i;
				if(sum >= 777) {
					//thows // class 
					throw new Exception("누적합이 777 !!!!!Error");
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
