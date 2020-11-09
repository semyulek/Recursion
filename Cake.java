
public class Cake {

	private int bites = 10;
	public Cake() {
		// Nothing to implement
	}
	
	public void takeABite() {
		bites--;
		System.out.println("Yum.");
	}
	
	public boolean isEmpty() {
		return bites == 0;
	}
}
