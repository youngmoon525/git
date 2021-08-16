import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {
	private Connection conn; // 연결 객체
	private PreparedStatement ps; // 전송 객체
	private ResultSet rs; // 결과 객체

	// DB접속 메소드
	public Connection getConn() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "hanul";
		String password = "0000";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("getConn()메소드 ! 연결 실패 ");
		}

		return conn;
	}

	// DB종료 메소드 : conn , ps , rs -> 역순으로 ->rs->ps->conn
	public void dbClose() {
		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public UserDTO userLogin(String id , String pw) {
		conn = getConn();
		String sql = "SELECT * FROM tbl_java_user " + 
				"where id = ? " + 
				"and pw =? ";
		UserDTO dto = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			while (rs.next()) {
				dto= new UserDTO(
						rs.getString("id"), 
						rs.getString("pw"), 
						rs.getString("name"), 
						rs.getString("admin"), 
						rs.getString("email"), 
						rs.getInt("money")
						);
						
			}//while
		} catch (SQLException e) {
			System.out.println("로그인()메소드 에러");
		} finally {
			dbClose();
		}
		return dto;

	}
}
