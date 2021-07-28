package pack02_Array;

public class Ex01_Array1 {
	public static void main(String[] args) {
		//배열이란?
		//자료형 변수를 생성하고 사용할때 주로 사용하며
		//'동일한' 자료형을 정해진 수만큼 저장 처리하는 '객체'
		int[] array ; // 배열을 선언 (정수형) 
		array = new int[4]; // 총 3개의 크기를 가진 배열을 초기화
		array[0] = 10;    //stack (array) value 100 =>    heap addr 100 [0][1][2] 
		array[1] = 10;
		array[2] = 10;
		array[3] = 10;
		System.out.println("array[0]의 값 " + array[0]);
		System.out.println("array[1]의 값 " + array[1]);
		System.out.println("array[2]의 값 " + array[2]);
		System.out.println("array[3]의 값 " + array[3]);
		System.out.println(array);//그냥 출력 시 메모리 어드레스가 출력
		//[1]0 [2]1 [3]2  [4]3 
		//배열의 선언 : DataType 부  , []   , 이름 ; = int[] array;
		//배열의 크기 할당 : array = new int[3];
		//배열은 저장공간이 연속적으로 배치되어 있으며 , 어드레스의 시작은0부터
		//내가 정한크기가 n개라면 사용할수있는 어드레스는 n-1;
		//                3개 -> [2]
	}
}
