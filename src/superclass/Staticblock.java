package superclass;

public class Staticblock {
	
	static String a = "";
	static {
		a = "welcome";
		
	}

	public static void main(String[] args) {
		System.out.println("hi " + a);
	}
}
