import java.util.Scanner;

public class Ex10_Method03DAO {
//기능 구현이 들어가야함 
	public int getArrsize() {
		Scanner sc = new Scanner(System.in);
	
		int arrSize = 0;
		while(true) {
			try {
				String inputData = sc.nextLine();//a
				arrSize = Integer.parseInt(inputData);
				if(arrSize < 1) {
					continue;
				}
				break;
			}catch (Exception e) {
				System.out.println("정수형 데이터를 입력해주세요.(0보다 큰)");
			}
		}
		
		return arrSize ;
	}

	//getArrSize는 문제 없었음
	
	public int[] getIntArr(int arrSize) { // 배열을 return하려면 배열의 사이즈를 받아와야한다.
		System.out.println("getIntArr 호출 됨");
		int[] rtnArr = new int[arrSize];//메인 메소드에서 보내준 인자값으로 배열을 생성(크기할당까지완료)
		return rtnArr;
	}
	
	//2021.07.16 작성자: 김영문 
	//기능 : size를 입력받아 String[]을 리턴하는 메소드
	public String[] getStrArr(int arrSize) {
		System.out.println("getStrArr 호출 됨");
		String[] rtnArr = new String[arrSize];
		return rtnArr;
	}
	//dto에 있는 (상태정보) 
	//intArr , strArr 값을 세팅
	public void getDto(Ex10_Method03DTO dto ) {
		for (int i = 0; i < dto.intArr.length; i++) {
			dto.intArr[i] = i;
		}
		for (int i = 0; i < dto.strArr.length; i++) {
			dto.strArr[i] = i+"";
		}
		System.out.println("getDto라는 메소드가 호출됨");
	}
	public void getInt(int aaa) {
		aaa = 30;
	}
}

