package superclass;

public class Methoverridd extends Methoverload {
	
	public  static void add() {
		
		System.out.println("over ridden");
		
	}
	

	public static void main(String[] args) {
		Methoverridd ab = new Methoverridd();
		ab.add();
		
	}


}
