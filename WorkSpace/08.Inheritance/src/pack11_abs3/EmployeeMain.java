package pack11_abs3;

public class EmployeeMain extends EmployeePG {
//강제해놓은 메소드들의 기능이 전부 끝나면
//하나의 페이지가 끝났다고 생각함.
public static void main(String[] args) {
	EmployeeMain epm = new EmployeeMain();
	epm.select();
	epm.update();
	epm.delete();
	epm.insert();
}
	@Override
	public void select() {
		System.out.println("사원 조회 완료");
		
	}

	@Override
	public void update() {
		//EmployeeUpdate <- 기능을 가진 객체를 만듬 EmployeeUpdateDAO
		//EmployeeDTO <- 상태정보를 가진 DTO는 하나만 존재
		System.out.println("사원 수정 완료");
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

}
