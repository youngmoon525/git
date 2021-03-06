package Ex_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class HrDAO {
	Connection conn; // 연결객체
	PreparedStatement ps; // 전송 객체(연결 객체를 통해서 초기화됨)
	ResultSet rs; // 결과 객체(전송객체의 결과를 받는 객체)

	// DB접속 메소드 (연결 객체를 초기화 함)
	// Url , user , password , Driver
	public Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:XE"; // DB접속 정보 //localhost == 127.0.0.1
		String user = "hr";
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

	// DB접속 종료를 위한 메소드
	public void dbClose() {
		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void chkPs() {
		conn = getConn();
		String sql = "select 1 from dual"; // 실제 DB에서 작동할 쿼리문
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("hr에 접근해서 출력: "+ rs.getInt(1));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("에러");
		}finally {
			System.out.println("DB를 닫아줌.rs->ps->conn");
			dbClose();
		}
	}

	public ArrayList<HrDTO> empSelectAll() {
		conn = getConn();
		String sql = "select * from EMP_COPY  order by  EMPLOYEE_ID  asc "; // 실제 DB에서 작동할 쿼리문
		ArrayList<HrDTO> list = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
//				System.out.println(
//						rs.getInt("employee_id") +        "\t\t"  +
//						rs.getString("first_name") +         "\t\t"  +
//						rs.getString("last_name") +          "\t\t"  +
//						rs.getString("email") +              "\t\t"  +
//						rs.getString("phone_number") +       "\t\t"  +
//						rs.getDate("hire_date") +          "\t\t"  +
//						rs.getString("job_id") +             "\t\t"  +
//						rs.getInt("salary") +             "\t\t"  +
//						rs.getInt("commission_pct") +     "\t\t"  +
//						rs.getInt("manager_id") +         "\t\t"  +
//						rs.getInt("department_id") 
//						
//						);
				//list.add( new HrDTO( 값 , , , , ,  , , , , ,)
				list.add(
							new HrDTO(
								rs.getInt("employee_id")     , 
								rs.getString("first_name")   , 
								rs.getString("last_name")    , 
								rs.getString("email")        , 
								rs.getString("phone_number") ,
								rs.getDate("hire_date") 	 ,
								rs.getString("job_id") 		 ,
								rs.getInt("salary") 		 ,
								rs.getInt("commission_pct")  ,
								rs.getInt("manager_id") 	 ,
								rs.getInt("department_id") 
								)
								
						);
			
				
			}//while
//			
//			for (HrDTO dto : list) {
//				System.out.println(dto.getEmployee_id() + "\t" + dto.getFirst_name() + "\t" + dto.getHire_date());
//			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("에러");
		}finally {
			System.out.println("DB를 닫아줌.rs->ps->conn");
			dbClose();
		}
		return list;
	}

	
	public void displayEmp(ArrayList<HrDTO> list) {
		for (HrDTO dto : list) {
			System.out.println(dto.getEmployee_id() + "\t" + dto.getFirst_name() + "\t" + dto.getHire_date());
		}
	}
	
	public ArrayList<DpDTO> depSelectAll() {
		conn = getConn();
		String sql = "select * from DEPARTMENTS "; // 실제 DB에서 작동할 쿼리문
		ArrayList<DpDTO> list = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add( new DpDTO(rs.getInt("DEPARTMENT_ID")
						, rs.getString("DEPARTMENT_NAME")
						, rs.getInt("manager_id"),
						rs.getInt("location_id"))
						);
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("에러");
		}finally {
			System.out.println("DB를 닫아줌.rs->ps->conn");
			dbClose();
		}
		return list;
	}
	
	
	public void displaydp(ArrayList<DpDTO> list) {
		for (DpDTO dto : list) {
			System.out.println(dto.getDepartment_id() + "\t" + dto.getDepartment_name() + "\t" + dto.getLocation_id());
		}
	}

	public int selectEmpID() {
		conn = getConn();
		String sql = "SELECT MAX(EMPLOYEE_ID)+1 as maxemp " + 
				       "FROM EMP_COPY " ;
		int empid = 0;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				empid = rs.getInt("maxemp");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("에러");
		}finally {
			System.out.println("DB를 닫아줌.rs->ps->conn");
			dbClose();
		}
		return empid ;
	}

	public int insertEmp(HrDTO dto) {
		conn = getConn();
		String sql = "INSERT INTO EMP_COPY " + 
					  "VALUES ( ? , ?, ? , ?, ? , sysdate , ? , ? , 0.12 , ? , ? ) " ;
					 //"VALUES ( 208 , 'f','l' , 'e','p' , null , 'j' , 1 , 0.123, 3 , 4 );" ;
		int result = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getEmployee_id());
			ps.setString(2, dto.getFirst_name());
			ps.setString(3, dto.getLast_name());
			ps.setString(4, dto.getEmail());
			ps.setString(5, dto.getPhone_number());
			//ps.setDate(6, dto.getHire_date());
			ps.setString(6, dto.getJob_id());
			ps.setInt(7, dto.getSalary());
			//ps.setInt(8, dto.getCommission_pct());
			ps.setInt(8, dto.getManager_id());
			ps.setInt(9, dto.getDepartment_id());
			result = ps.executeUpdate();
			System.out.println(result);
		}catch (Exception e) {
			System.out.println(e.getStackTrace() );
			System.out.println(e.getMessage());
		}
		
		
		return 0;
	}
	
	
}
