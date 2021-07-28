
public class DrinkDAO {
	public  void getDisplay(DrinkDTO[] dtos) {
		for (int i = 0; i < dtos.length; i++) { 
			System.out.println(dtos[i].num + "번." + dtos[i].name + "(" + dtos[i].price + ")");
		}
	}
	
	public  void chooseDrink(DrinkDTO[] dtos , int ichoose , int inputNum) {
		for (int i = 0; i < dtos.length; i++) { 
			if(dtos[i].num == ichoose) {
				System.out.println(inputNum - dtos[i].price);
				break;
			}
		}
	}
}
