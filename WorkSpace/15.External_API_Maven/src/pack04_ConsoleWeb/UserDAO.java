package pack04_ConsoleWeb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pack02_Member.MemberDAO;

public class UserDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs ; 
	MemberDAO dao ;
	public UserDAO(MemberDAO dao) {
		this.dao = dao;
	}
	public void userLogin(String id, String pw) {
		conn = dao.getConn(); //1.DB접속
		String sql = "SELECT * " + 
				"FROM java_user_info " + 
				"WHERE id = ? " + 
				"AND pw = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("로그인 실패 오류");
		}
	}

}
