package pack99_SingleTon;

public class SingleTonMain {
	public static void main(String[] args) {
		//인스턴스화 
		//SingleTon singleTon = new private으로 생성자 자체를 막아놈(외부에서 생성을 못하게 함)
		SingleTon singleTon1 = SingleTon.getInstance();//getInstance메소드는 return을 SingleTon을 해줌
		SingleTon singleTon2 = SingleTon.getInstance();
		//SingleTon의 사용빈도가 높은 기능을 구현하는 경우
		//DB에 접속하는 경우 
		//DB에 접속하는 IP나 계정(id) , Pw 등은 쉽게 변하지 않기 때문에 
		//개발자가 해당하는 내용을 수정할수 없게 막고 그정보를 그냥 사용할수있게 jar파일로 배포해줌
		//DBA<-라는 직업 
		if(singleTon1 == singleTon2) {
			System.out.println("참조가 같습니다.");
		}else {
			System.out.println("참조가 다릅니다.");
		}
	}
}
