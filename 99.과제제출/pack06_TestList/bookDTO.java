package pack06_TestList;

public class bookDTO {
	//도서 번호(나중에 추가했음) , 제목 , 저자 , 출판사 , 가격
	private int num;
	private String name;
	private String author;
	private String publisher;
	private int price;
	
	public bookDTO() {
		
	}
	
	public bookDTO(int num, String name, String author, String publisher, int price) {
		super();
		this.num = num;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
	