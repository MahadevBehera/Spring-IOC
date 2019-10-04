package Lab34;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {
	@Autowired(required = true)
	@Qualifier("ao2") // for ByName detection 
	private A aobj; // F.I
	@Autowired(required = false)
	@Qualifier("bo2") // for ByName detection 
	private B bobj; // F.I

	public Hello() {
		System.out.println("Hello-()");
	}

	public void show() {
		System.out.println("show in Hello");
		System.out.println(aobj); // A [a=88, msg=Hello Guys]
		System.out.println(bobj); // B [b=66, str=Hai Guys]
	}
}
