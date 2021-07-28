import java.util.Arrays;

import pack03_OOP1.ProductDAO;
import pack03_OOP1.ProductDTO;

public class Ex10_Method03Main {
	public static void main(String[] args) {
		Ex10_Method03DTO dto = new Ex10_Method03DTO();
		Ex10_Method03DAO dao = new Ex10_Method03DAO();
		//int arrSize = dao.getArrsize(); 
		dto.arrSize = dao.getArrsize(); 
		dto.intArr = dao.getIntArr(dto.arrSize);
		dto.strArr = dao.getStrArr(dto.arrSize);
		System.out.println(Arrays.toString(dto.intArr));
		System.out.println(Arrays.toString(dto.strArr));
		
		dao.getDto(dto);//호출
		System.out.println(Arrays.toString(dto.intArr));
		System.out.println(Arrays.toString(dto.strArr));
		int aaa = 10 ;
		System.out.println(aaa);
		dao.getInt(aaa);
		System.out.println(aaa);
		//getDto를 호출했을때 strArr도 인덱스로 초기화
		//System.out.println(Arrays.toString(intArr));
		
		//em.arrSize = dao.getArrsize();
		//String[] strArr =dao.getStrArr(em.arrSize);
		//System.out.println(Arrays.toString(strArr));
		ProductDAO dao2 = new ProductDAO();
		ProductDTO dto2 = new ProductDTO(3, "32", 48949);
		dao2.display(dto2);
		
	}
}
