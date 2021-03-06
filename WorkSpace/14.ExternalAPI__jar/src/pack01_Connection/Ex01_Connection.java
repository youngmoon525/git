package pack01_Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Ex01_Connection {
	//정적멤버 
	private static Connection conn; //연결객체 
	
	public static void main(String[] args) {
		getConn();
	}
	//DB접속 메소드
	public static void getConn() {
		//1.String url = "jdbc:oracle:thin:@localhost:1521:XE"; 
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE"; 
		String user = "hanul";
		String password = "0000";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB접속이 된거같습니다.");
			System.out.println(conn.isClosed()); //DB의 연결상태가 닫혀있는지 열려있는지 체크
			conn.close();
			System.out.println(conn.isClosed());
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터베이스 연결이 안됨 ");
		}
		
	}
	
}
