package pack02;

import pack01.*;//<다른 패키지에 있는 B라는 클래쓰에 접근을 하기 위한 import문
				//컴파일러는 import 구문을 먼저 해석함.
				//* < shift + 8 는 하위에 있는 파일 전부를 뜻함.

public class C {
	//A a default 접근제한자로 인해 다른 패키지에서 접근이 불가능함.
	//접근제한자가 이해가 안가는 상태에서 개발을 진행할때는 public을 사용하는게 편하다.
	B  b ;
}
