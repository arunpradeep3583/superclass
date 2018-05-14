package superclass;

public class Thisvalue {
	
	int a;
	String b;
	
	Thisvalue(int a, String b) {
		this.a =a;
		this.b = b;
	
	}
	

	public void display() {
		System.out.println(a+"   "+b);
	}
	
	public static void main(String[] args) {
		Thisvalue ab = new Thisvalue(10, "welcome");
		ab.display();
	}

}
