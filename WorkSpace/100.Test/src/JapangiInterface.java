
public interface JapangiInterface {
	//사용자 금액 입력
	//음료의 목록을 보여줌
	//음료를 선택
	//잔돈 배출
	public int getInt(String msg); //1.사용자가 무조건 인트형을 입력할수있는 메소드 
	public void displayDrink(DrinkDTO[] drinkDTOs); //2.음료의 목록을 보여줌
	public void choiceDrink(); //3.음료를 선택
	public DrinkDTO[] getData();
	
	
}
