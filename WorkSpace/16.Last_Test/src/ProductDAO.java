import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
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

	//상품 목록 전체 조회 
	//ArrayList<ProuctDTO> 
	public ArrayList<ProductDTO> allProductSelect() {
		conn = getConn();
		String sql = "SELECT * FROM tbl_java_product " ;
		ArrayList<ProductDTO> list = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new ProductDTO(
						rs.getInt("num"), 
						rs.getString("name"), 
						rs.getString("company"), 
						rs.getInt("price"), 
						rs.getInt("qty"))
						);//list.add
						
			}//while
		} catch (SQLException e) {
			System.out.println("상품목록 조회()메소드 에러");
		} finally {
			dbClose();
		}
		return list;
	}

	public void displayProduct(ArrayList<ProductDTO> list) {
		if(list.size() == 0) {
			System.out.println("등록 된 상품이 없습니다.");
		}else {
			for (ProductDTO dto : list) {
				System.out.print("상품 번호 : "+ dto.getNum() +"\t");
				System.out.print("상품 명 : "+ dto.getName() +"\t");
				System.out.print("제조사 : "+ dto.getCompany() +"\t");
				System.out.print("가격 : "+ dto.getPrice() +"\t");
				System.out.print("재고 : "+ dto.getQty() +"\t");
				System.out.println();
			}
		}
	}

	public ArrayList<ProductDTO> selectProduct(String inputData, String string) {
		conn = getConn();
		String sql = "SELECT * FROM tbl_java_product where " + string + " like ?" ;
		ArrayList<ProductDTO> list = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" +  inputData + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new ProductDTO(
						rs.getInt("num"), 
						rs.getString("name"), 
						rs.getString("company"), 
						rs.getInt("price"), 
						rs.getInt("qty"))
						);//list.add
						
			}//while
		} catch (SQLException e) {
			System.out.println("조건으로 상품 조회()메소드 에러");
		} finally {
			dbClose();
		}
		return list;
		
	}

	public int checkNum(int num) {
		conn = getConn();
		String sql = "SELECT * FROM tbl_java_product where num = ? " ;
		ArrayList<ProductDTO> list = new ArrayList<>();
		int result = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			while (rs.next()) {
				result = 1;
			}//while
		} catch (SQLException e) {
			System.out.println("조건으로 상품 조회()메소드 에러");
		} finally {
			dbClose();
		}
		return result;
	}

	
	public ProductDTO checkNumDTO(int num) {
		conn = getConn();
		String sql = "SELECT * FROM tbl_java_product where num = ? " ;
		ProductDTO dto = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			while (rs.next()) {
				dto = new ProductDTO(rs.getInt("num"),
						rs.getString("name"), 
						rs.getString("company"), 
						rs.getInt("price"), 
						rs.getInt("qty")
						);//dto
			}//while
		} catch (SQLException e) {
			System.out.println("조건으로 상품 조회()메소드 에러");
		} finally {
			dbClose();
		}
		return dto;
	}

	
	
	public int insertProduct(ProductDTO dto) {
		conn = getConn();
		String sql = "INSERT INTO TBL_JAVA_PRODUCT VALUES( ? , ? , ? ,? , ?)" ;
		int result = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getNum());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getCompany());
			ps.setInt(4, dto.getPrice());
			ps.setInt(5, dto.getQty());
			result = ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("상품 추가 ()메소드 에러");
		} finally {
			dbClose();
		}
		return result;
	}

	public int deleteProduct(int num) {
		conn = getConn();
		String sql = "DELETE FROM TBL_JAVA_PRODUCT WHERE NUM = ? " ;
		int result = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			result = ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("상품 삭제 ()메소드 에러");
		} finally {
			dbClose();
		}
		return result;
	}

	public int updateProduct(int num, int qty) {
		conn = getConn();
		String sql = "UPDATE TBL_JAVA_PRODUCT SET QTY = ? WHERE NUM = ? " ;
		int result = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, qty);
			ps.setInt(2, num);
			result = ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("재고 관리 ()메소드 에러");
		} finally {
			dbClose();
		}
		return result;
	}

	public int addMoney(String id, int money) {
		conn = getConn();
		String sql = "UPDATE TBL_JAVA_USER SET MONEY = MONEY + ? WHERE ID = ? " ;
		int result = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, money);
			ps.setString(2, id);
			result = ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("금액 추가()메소드 에러");
		} finally {
			dbClose();
		}
		return result;
	}

	public int minusMoney(int money, String id) {
		conn = getConn();
		String sql = "UPDATE TBL_JAVA_USER SET MONEY = MONEY - ? WHERE ID = ? " ;
		int result = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, money);
			ps.setString(2, id);
			result = ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("사용자 금액 처리()메소드 에러");
		} finally {
			dbClose();
		}
		return result;
	}

	public int minusQty(int qty, int num) {
		conn = getConn();
		String sql = "UPDATE TBL_JAVA_PRODUCT SET QTY = QTY - ? WHERE NUM = ? " ;
		int result = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, qty);
			ps.setInt(2, num);
			result = ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("재고 마이너스()메소드 에러");
		} finally {
			dbClose();
		}
		return result;
	}

}
