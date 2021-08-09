package pack02_Member;
//Connection Dabase

//그외 기능들 display..기타 등등 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
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
			if (rs != null)rs.close();
			if (ps != null)ps.close();
			if (conn != null) conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//실제 tblMember에 있는 사용자 정보를 조회하는 메소드
	public ArrayList<MemberDTO> selectMember() {
		conn = getConn();
		String sql = "select * from tblmember ";
		ArrayList<MemberDTO> list = new ArrayList<>();
		//list내부에 dto를 정보들을 집어 넣음
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();//쿼리를 실행함 그결과를 rs에 받음
			while (rs.next()) {
				//rs.getInt <= int형 정보를 return
				//rs.getString <= String형 정보를 return
				//System.out.println(rs.getString(0));rs에 있는 행의 번호를 통해서 데이터를가져옴
				//rs에 있는 행의 이름을 통해서 데이터를 가져옴
				list.add(new MemberDTO(rs.getInt("num"), 
						rs.getString("name"),
						rs.getInt("age"), 
						rs.getString("addr"), 
						rs.getString("tel"))//dto
						);//list
				//===> ArrayList<>();
			}
		} catch (SQLException e) {
			System.out.println("selectMember()메소드 에러");
		}finally {
			dbClose();//DB를 오류가 났든 안났든 닫아라 
		}
		return list;
		
	}
	
	//출력 (사용자 정보들을 출력)
	public void display(ArrayList<MemberDTO> list) {
		if(list.size() == 0) {
			System.out.println("검색 결과가 없습니다 !");
		}else {
			System.out.println("번호\t" + "이름\t" + "나이\t" + "주소\t" + "Tel\t");
			for (MemberDTO dto : list) {
				System.out.print(dto.getNum() + "\t");
				System.out.print(dto.getName() + "\t");
				System.out.print(dto.getAge() + "\t");
				System.out.print(dto.getAddr() + "\t");
				System.out.print(dto.getTel() + "\n");
			}
		}
		
		
	}


}
