package pack06_imp;

public class OracleDAO implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("오라클에 정보 검색");
	}

	@Override
	public void insert() {
		System.out.println("오라클에 정보 추가");
	}

	@Override
	public void update() {
		System.out.println("오라클에 정보 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("오라클에 정보 삭제");
	}

}
