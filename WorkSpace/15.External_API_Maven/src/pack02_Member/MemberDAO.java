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

	// 실제 tblMember에 있는 사용자 정보를 조회하는 메소드
	public ArrayList<MemberDTO> selectMember() {
		conn = getConn();
		String sql = "select * from tblmember ";
		ArrayList<MemberDTO> list = new ArrayList<>();
		// list내부에 dto를 정보들을 집어 넣음
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();// 쿼리를 실행함 그결과를 rs에 받음
			while (rs.next()) {
				// rs.getInt <= int형 정보를 return
				// rs.getString <= String형 정보를 return
				// System.out.println(rs.getString(0));rs에 있는 행의 번호를 통해서 데이터를가져옴
				// rs에 있는 행의 이름을 통해서 데이터를 가져옴
				list.add(new MemberDTO(rs.getInt("num"), rs.getString("name"), rs.getInt("age"), rs.getString("addr"),
						rs.getString("tel"))// dto
				);// list
					// ===> ArrayList<>();
			}
		} catch (SQLException e) {
			System.out.println("selectMember()메소드 에러");
		} finally {
			dbClose();// DB를 오류가 났든 안났든 닫아라
		}
		return list;

	}

	// 출력 (사용자 정보들을 출력)
	public void display(ArrayList<MemberDTO> list) {
		if (list.size() == 0) {
			System.out.println("검색 결과가 없습니다 !");
		} else {
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

	public MemberDTO checkNum(int num) {
		conn = getConn(); // 1.getConn
		String sql = "select * from tblMember where num = ? ";
		MemberDTO dto = null;
		// String sql = "select * from tblMember where num = " + num ;
		try {
			ps = conn.prepareStatement(sql); // 2.전송객체
			ps.setInt(1, num); // 매개변수 값을 전송객체에 추가해서 같이 보냄
			rs = ps.executeQuery(); // 전송객체가 sql문을 실행하고 결과를 가져옴
			while (rs.next()) {
				dto = new MemberDTO(rs.getInt("num"), rs.getString("name"), rs.getInt("age"), rs.getString("addr"),
						rs.getString("tel"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DAO - CheckNum()Method Error ! ");
		} finally {
			dbClose();
		}
		return dto;
	}

	public int insertMember(MemberDTO dto) {
		conn = getConn();
		String sql = "insert into tblMember values (? , ? , ? , ? , ? )";
		// String sql = "insert into tblMember (num , name , age , addr , tel)";
		// sql += "values (? , ? , ? ) ";
		// Insert, Update , Delete 를 통해서 데이터의 조작이 일어나고
		// 데이터의 조작이 일어났을때는 결과값은 int형을 return해준다.
		int succ = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getNum());
			ps.setString(2, dto.getName());
			ps.setInt(3, dto.getAge());
			ps.setString(4, dto.getAddr());
			ps.setString(5, dto.getTel());
			succ = ps.executeUpdate();// 데이터를 조작하고 그결과를 return해줌 성공 = 1
			System.out.println(succ);
			// ojdbc 사용해서 insert, update , delete작업을 하면 auto commit;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("insertMember() Exception");
		}
		return succ; // int형을 return하는 메소드
	}

	public int deleteMember(int num) {
		conn = getConn();// x
		String sql = "DELETE FROM tblMember WHERE num = ? ";// o
		int succ = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			succ = ps.executeUpdate();
			System.out.println(succ);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Delete() Exception");
		}
		return succ;
	}

	public int updateMember(MemberDTO dto) {
		conn = getConn();// x
		String sql = "update tblmember ";// o
		sql += " set name=? , age=? , addr=? , tel=? ";
		sql += " where num=? ";
		int succ = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setInt(2, dto.getAge());
			ps.setString(3, dto.getAddr());
			ps.setString(4, dto.getTel());
			ps.setInt(5, dto.getNum());
			succ = ps.executeUpdate();
			System.out.println(succ);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Update() Exception");
		}
		return succ;
	}

	public ArrayList<MemberDTO> addrSelect(String addr) {
		// DB 1.Connection , 1.5)SQL
		// 2.PreparedStatement 3.excute(Query,Update) 4.결과받기 (ResultSet,Int)
		conn = getConn();// 1
		String sql = "select * from tblmember where addr like ?"; // addr like '%값%'//1.5
		ArrayList<MemberDTO> list = new ArrayList<>();
		try {
			// 2
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + addr + "%");// index는 1번부터 , 값
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new MemberDTO(rs.getInt("num"), 
						rs.getString("name"), 
						rs.getInt("age"), 
						rs.getString("addr"),
						rs.getString("tel")

				));

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("addrSelect 오류 ");
		}finally {
			dbClose();
		}
		return list;
	}

	public ArrayList<MemberDTO> nameSelect(String name) {
		// DB 1.Connection , 1.5)SQL
		// 2.PreparedStatement 3.excute(Query,Update) 4.결과받기 (ResultSet,Int)
		conn = getConn();// 1
		String sql = "select * from tblmember where name like ?"; // addr like '%값%'//1.5
		ArrayList<MemberDTO> list = new ArrayList<>();
		try {
			// 2
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + name + "%");// index는 1번부터 , 값
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new MemberDTO(rs.getInt("num"), 
						rs.getString("name"), 
						rs.getInt("age"), 
						rs.getString("addr"),
						rs.getString("tel")

				));

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("addrSelect 오류 ");
		}finally {
			dbClose();
		}
		return list;
	}

	public ArrayList<MemberDTO> telSelect(String tel) {
		// DB 1.Connection , 1.5)SQL
				// 2.PreparedStatement 3.excute(Query,Update) 4.결과받기 (ResultSet,Int)
				conn = getConn();// 1
				String sql = "select * from tblmember where tel like ?"; // addr like '%값%'//1.5
				ArrayList<MemberDTO> list = new ArrayList<>();
				try {
					// 2
					ps = conn.prepareStatement(sql);
					ps.setString(1, "%" + tel + "%");// index는 1번부터 , 값
					rs = ps.executeQuery();
					while (rs.next()) {
						list.add(new MemberDTO(rs.getInt("num"), 
								rs.getString("name"), 
								rs.getInt("age"), 
								rs.getString("addr"),
								rs.getString("tel")

						));

					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("addrSelect 오류 ");
				}finally {
					dbClose();
				}
				return list;
	}

	
	
	//2번 방법
	public ArrayList<MemberDTO> likeSelect(String colName , String inputData) {
		// DB 1.Connection , 1.5)SQL
		// 2.PreparedStatement 3.excute(Query,Update) 4.결과받기 (ResultSet,Int)
		conn = getConn();// 1
		String sql = "select * from tblmember where "+ colName + " like ?"; // addr like '%값%'//1.5
		ArrayList<MemberDTO> list = new ArrayList<>();
		try {
			// 2
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + inputData + "%");// index는 1번부터 , 값
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new MemberDTO(rs.getInt("num"), 
						rs.getString("name"), 
						rs.getInt("age"), 
						rs.getString("addr"),
						rs.getString("tel")

				));

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("addrSelect 오류 ");
		}finally {
			dbClose();
		}
		return list;
	}

	
	//3번 방법
	public ArrayList<MemberDTO> likeSelect2(String sql , String inputData) {
		// DB 1.Connection , 1.5)SQL
		// 2.PreparedStatement 3.excute(Query,Update) 4.결과받기 (ResultSet,Int)
		conn = getConn();// 1
		 // addr like '%값%'//1.5
		ArrayList<MemberDTO> list = new ArrayList<>();
		try {
			// 2
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + inputData + "%");// index는 1번부터 , 값
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new MemberDTO(rs.getInt("num"), 
						rs.getString("name"), 
						rs.getInt("age"), 
						rs.getString("addr"),
						rs.getString("tel")

				));

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("addrSelect 오류 ");
		}finally {
			dbClose();
		}
		return list;
	}

}
