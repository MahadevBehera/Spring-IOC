package Lab23;

public class B {
	private int b;       // C.I
	private String str;  // C.I
	
	public B(int b, String str) {
		System.out.println("B -- 2 arg");
		this.b = b;
		this.str = str;
	}

	@Override
	public String toString() {
		return "B [b=" + b + ", str=" + str + "]";
	}
	
}
