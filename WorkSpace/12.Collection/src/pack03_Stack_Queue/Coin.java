package pack03_Stack_Queue;

public class Coin {
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if(value < 1) {
			System.out.println("잘못된값이 입력되고있음");
		}else {
		this.value = value;
		}
	}
	
	
	
	//?
}
