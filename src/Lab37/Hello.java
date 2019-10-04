package Lab37;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	@Autowired(required = false)
	private A aobj; // F.I
	@Autowired(required = false)
	private B bobj; // F.I

	public Hello() {
		System.out.println("Hello-()");
	}

	public void show() {
		System.out.println("show in Hello");
		System.out.println(aobj); // null
		System.out.println(bobj); // null
	}
}
