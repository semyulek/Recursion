
public class EatCake {
	
	public EatCake() {
		
	}

	private static void eatCake(Cake cake) {
		if(! cake.isEmpty()) {
			cake.takeABite();
			eatCake(cake);
		}
	}
	
	public static void main(String[] args) {
		Cake cake = new Cake();
		eatCake(cake);
		System.out.println("Ate cake recurssively.");
	}

}
