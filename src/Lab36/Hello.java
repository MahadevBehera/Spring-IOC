package Lab36;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {
	private A aobj; // F.I
	private B bobj; // F.I

	public Hello() {
		System.out.println("Hello-()");
	}
	@Autowired
	public Hello(@Qualifier("ao2") A aobj,@Qualifier("bo2") B bobj) {
		System.out.println("Hello-2 arg Con");
		this.aobj = aobj;
		this.bobj = bobj;
	}

	public void show() {
		System.out.println("show in Hello");
		System.out.println(aobj); // A [a=77, msg=Hello Guys]
		System.out.println(bobj); // B [b=66, str=Hai Guys]
	}
}
