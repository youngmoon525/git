package pack03_Horse;

import javax.swing.JOptionPane;

//경마게임의 등수 처리를 위한 객체
public class Rank {
	int rank ;  //등수
	
	public Rank() {	}
	
	//결승점을 통과한 말의 이름을 출력하자
	public void finishLine(String name) {
		rank = Horse.count ++ ; 
		//1 , 2 , 3-->>>
		System.out.println(name + " 말 " + rank + "등으로 결승점을 통과했습니다.");
		if(rank == 1) {
			JOptionPane.showMessageDialog(null, name);
		}
	}

}
