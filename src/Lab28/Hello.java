package Lab28;

public class Hello {
	private A aobj; // S.I
	private B bobj; // S.I

	public Hello() {
		System.out.println("Hello-()");
	}

	public void show() {
		System.out.println("show in Hello");
		System.out.println(aobj); // null
		System.out.println(bobj); // null
	}
}
