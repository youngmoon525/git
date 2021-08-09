package pack01_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex02_Sql { 
	
	private Connection conn; //1.연결 객체
	private PreparedStatement ps; //2.전송객체
	private ResultSet rs; //3.결과 객체 : select 문 등등 
	
	public static void main(String[] args) {
		Ex02_Sql es = new Ex02_Sql(); //인스턴스화 
		es.test();
	}
	
	//1.DB접속 메소드(Connection을 return해줘서 다른 메소드에서도 사용할수있게->conn) 
	public Connection getConn() {
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE"; 
		String user = "hanul";
		String password = "0000";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터베이스 연결이 안됨 ");
		}
		
		return conn;
	}//getConn()
	
	public void test() {
		//1.Connection
		conn = getConn();
		String sql = "select 100 as num from dual ";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("num"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("조회 실패오류");
		}
	}
	
}
