package pack06_testList;


//도서의 상태정보를 저장할 DTO를 만듬
public class BookDTO {
	private String name ;
	private String author;
	private String company;
	private int price ;
	
	
	
	public BookDTO(String name, String author, String company, int price) {
		super();
		this.name = name;
		this.author = author;
		this.company = company;
		this.price = price;
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
