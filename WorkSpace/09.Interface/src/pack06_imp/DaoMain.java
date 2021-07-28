package pack06_imp;

public class DaoMain {
	public static int dbType = 1;
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.update();
		dao.delete();
		dao.insert();
	}
	
	
	public static void main(String[] args) {
		if(dbType == 1) {
			dbWork(new OracleDAO());
		}else {
			dbWork(new MySql());
		}
	

	}
}
