package pack06_imp;
//DAO 데이터 베이스에 접근해서 정보를 얻어오는 기능을 수행하는 객
public interface DataAccessObject {
	public void select();//조회
	public void insert();//추가
	public void update();//수정
	public void delete();//삭제

}
