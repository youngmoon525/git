
public class Japangi {
	
	class DrinkDTO{
		int num ;
		String name;
		int price;
		public DrinkDTO(int num, String name, int price) {
			super();
			this.num = num;
			this.name = name;
			this.price = price;
		}
		
	}//DrinkDTO
	
	public static void main(String[] args) {
		Japangi j = new Japangi();
		Japangi.DrinkDTO dto = j.new DrinkDTO(1, "콜라", 3000);
	}
}
