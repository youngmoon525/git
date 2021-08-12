package pack04_ConsoleWeb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pack02_Member.MemberDAO;

public class UserDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	MemberDAO dao;

	public UserDAO(MemberDAO dao) {
		this.dao = dao;
	}

	public UserDTO userLogin(String id, String pw) {
		conn = dao.getConn(); // 1.DB접속
		UserDTO dto = null;
		String sql = "SELECT * " + "FROM java_user_info " + "WHERE id = ? " + "AND pw = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("id"));
				dto = new UserDTO(id, // ==String
						pw, // ==String
						rs.getString("name"), // ==String
						rs.getString("tel"), // ==String
						rs.getString("birth") // ==String
				);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("로그인 실패 오류");
		}
		return dto;
	}// userLogin

	public int idCheck(String id) {
		conn = dao.getConn();// 1.
		int rtnInt = 0;
		String sql = "select count(*) as idCnt " + "from java_user_info " + "where id = ? "; // 1.5

		try {
			ps = conn.prepareStatement(sql);

			ps.setString(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				rtnInt = rs.getInt("idCnt");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 2.
		return rtnInt;

	}

	public int userJoin(UserDTO joinDTO) {
		conn = dao.getConn();
		int succ = 0;
		String sql = "INSERT INTO java_user_info values ( ? , ? , ? , ? , ? ) ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, joinDTO.getId());
			ps.setString(2, joinDTO.getPw());
			ps.setString(3, joinDTO.getName());
			ps.setString(4, joinDTO.getTel());
			ps.setString(5, joinDTO.getBirth());
			succ = ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("UserJoin Err");
		}
		return succ;

	}

}
