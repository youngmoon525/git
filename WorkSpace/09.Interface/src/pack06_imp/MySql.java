package pack06_imp;

public class MySql implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySql 정보 검색");
	}

	@Override
	public void insert() {
		System.out.println("MySql 정보 추가");
	}

	@Override
	public void update() {
		System.out.println("MySql 정보 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql 정보 삭제");
	}

}
