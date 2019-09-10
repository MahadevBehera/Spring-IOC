package Lab7;
// Designed as Singleton design pattern
public class Hello {
	private static Hello hello = new Hello ();
	
	static {
		System.out.println("Hello -- S.B ");
	}
	private Hello() {
		System.out.println("Hello -- D.C ");
	}
	
	// static factory method given to get single Hello instance
	public static Hello createHelloInstance() {
		System.out.println("static factory method");
		return hello;
	}
	
	// Other Methods
	public String toString() {
		return "I am Hello";
	}
}
