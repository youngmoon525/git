package Ex_JDBC;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class HrMain {
	public static void main(String[] args) {
		System.out.println("HR 테이블 조회 프로그램 입니다.");
		HrDAO dao = new HrDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("사원 정보 조회 : E ");
		System.out.println("부서 정보 조회 : D ");
		
		String inputData = sc.nextLine();
		if (inputData.equalsIgnoreCase("e")) {
			System.out.println("사원 정보를 조회 합니다.");
			ArrayList<HrDTO> list = dao.empSelectAll();
			dao.displayEmp(list);
			System.out.println("사원 정보 추가 : I");
			System.out.println("사원 정보 수정 : U");
			System.out.println("사원 정보 삭제 : D");
			inputData = sc.nextLine(); // R= Read , INSERT , UPDATE , DELETE 
			if(inputData.equalsIgnoreCase("I")) {
				System.out.println("사원 정보 추가 기능 입니다.");
				//사원 번호를 자동으로 채번 
				HrDTO dto = new HrDTO();
				dto.setEmployee_id( dao.selectEmpID() );
				System.out.println("FIRST_NAME을 입력하세요.");
				dto.setFirst_name(sc.nextLine());
				System.out.println("LAST_NAME을 입력하세요.");
				dto.setLast_name(sc.nextLine());
				System.out.println("EMAIL을 입력하세요.");
				dto.setEmail(sc.nextLine());
				System.out.println("PHONE_NUMBER을 입력하세요.");
				dto.setPhone_number(sc.nextLine());
				System.out.println("JOB_ID을 입력하세요.");
				dto.setJob_id(sc.nextLine());
				System.out.println("SALARY을 입력하세요.INT");
				dto.setSalary(Integer.parseInt(sc.nextLine()));
				System.out.println("COMMISSION_PCT을 입력하세요.INT");
				dto.setCommission_pct(Integer.parseInt(sc.nextLine()));
				System.out.println("MANAGER_ID을 입력하세요.INT");
				dto.setManager_id(Integer.parseInt(sc.nextLine()));
				System.out.println("DEPARTMENT_ID을 입력하세요.INT");
				dto.setDepartment_id(Integer.parseInt(sc.nextLine()));
				
				
				int result = dao.insertEmp(dto);
				System.out.println(result);
				//Date date = Date.valueOf("2021-08-01");<-방법만 알아둘것
				
				
			}else if(inputData.equalsIgnoreCase("U")) {
				System.out.println("사원 정보 수정 기능 입니다.");
			}else if(inputData.equalsIgnoreCase("D")) {
				System.out.println("사원 정보 삭제 기능 입니다.");
			}
			
		}else if(inputData.equalsIgnoreCase("d")) {
			System.out.println("부서 정보를 조회 합니다.");
			ArrayList<DpDTO> list =  dao.depSelectAll();
			dao.displaydp(list);
		}
	}
}
