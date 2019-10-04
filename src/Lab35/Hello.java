package Lab35;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	private A aobj; // F.I
	private B bobj; // F.I

	public Hello() {
		System.out.println("Hello-()");
	}
	@Autowired
	public Hello(A aobj, B bobj) {
		System.out.println("Hello-2 arg Con");
		this.aobj = aobj;
		this.bobj = bobj;
	}

	public void show() {
		System.out.println("show in Hello");
		System.out.println(aobj); // A [a=99, msg=Hello Guys]
		System.out.println(bobj); // B [b=88, str=Hai Guys]
	}
}
