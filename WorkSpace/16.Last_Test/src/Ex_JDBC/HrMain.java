package Ex_JDBC;

import java.util.ArrayList;
import java.util.Scanner;

public class HrMain {
	public static void main(String[] args) {
		System.out.println("HR 테이블 조회 프로그램 입니다.");
		HrDAO dao = new HrDAO();
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		if (inputData.equalsIgnoreCase("e")) {
			System.out.println("사원 정보를 조회 합니다.");
			ArrayList<HrDTO> list = dao.empSelectAll();
			dao.displayEmp(list);
		}else if(inputData.equalsIgnoreCase("d")) {
			System.out.println("부서 정보를 조회 합니다.");
			ArrayList<DpDTO> list =  dao.depSelectAll();
			dao.displaydp(list);
		}
	}
}
