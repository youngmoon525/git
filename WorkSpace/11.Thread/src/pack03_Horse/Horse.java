package pack03_Horse;

//말을 세팅할 객체
public class Horse extends Thread {
	//말의 이름
	String name;
	//총길이
	int meter = 100;
	Rank rank;
	//등수를 매길수 있는  int형 변수
	static int count = 1;
	
	public Horse() {	} //생성자 메소드 빈 깡통
	
	public Horse(String name , Rank rank) {
		this.name = name;
		this.rank = rank;
	}
	//실제 말이 달리거나 하는 처리를 넣을 Thread의 run메소드 
	@Override
	public void run() {
		while(true) {
			// ** 1~2000 사이의 난수를 발생하고 그 시간만큼 sleep 
			// Random함수를 이용해서 sleep을 시키는데 random값을 이용함
			try {
				//sleep을 시킴 Math.random * 2000 (0~1999) +1 == 1~2000
				//long->int 캐스팅 
				sleep( (int)  (Math.random() * 2000 + 1) );
				System.out.println(name + "말의 남은 거리 " + meter);
				meter -= 20;
				//meter =- 20;
				
				if (meter == 0) {
					this.rank.finishLine(name);
					break;
				}
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
