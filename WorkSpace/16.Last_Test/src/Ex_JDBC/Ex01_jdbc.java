package Ex_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex01_jdbc {
	// java database conn
	Connection conn; // 연결 객체 (mysql , oracle , mssql )
	PreparedStatement ps; // 전송 객체(데이터를 요청, 요청한 데이터를 받아옴)
	ResultSet rs; // 전송 객체를 통해서 데이터를 받아옴
	// static 에서는 인스턴스 멤버 사용 불가 (인스턴스화 하면 사용가능)
	// 인스턴스 멤버 -> static멤버 사용가능 , 인스턴스멤버 사용가능

	public static void main(String[] args) {
		Ex01_jdbc ej = new Ex01_jdbc();
		//ej.conn = ej.getConn();
		ej.chkPs();
		ej.selectUser("select id from tbl_java_user ");
	}

	// DB접속
	public Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:XE"; // DB접속 정보 //localhost == 127.0.0.1
		String user = "hanul";
		String password = "0000";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Oracle에 접속하기 위해서 Driver를 가져옴
			// 동적 로딩
			// oracle.jdbc.driver.OracleDriver
			conn = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getConn() 에러가 났습니다.");
		}
		return conn;
	}

	public void dbClose() {
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(conn != null)conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 전송 객체가 OracleDataBase까지 접근해서 dual테이블이라는 가상의테이블로
	// 내가 원하는 결과를 얻어오면 전송객체 또한 이상이 없음을 확인할수가있다.
	public void chkPs() {
		conn = getConn();
		String sql = "select 1 from dual"; // 실제 DB에서 작동할 쿼리문
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("에러");
		}finally {
			System.out.println("DB를 닫아줌.rs->ps->conn");
			dbClose();
		}
	}
	
	public void selectUser(String sql) {
		conn = getConn(); 
		//sql문은 메소드를 호출하는 부분에서 주는것으로 한다.
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("id"));
			}
		}catch (Exception e) {
			
		}finally {
			dbClose();
		}
	}
}
