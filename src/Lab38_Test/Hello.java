package Lab38_Test;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	
	private A aobj; // C.I (1) (Automatically injected by constructor without specifying any wiring)
	
	@Autowired
	private B bobj; // F.I (2)
	
	private String data; // S.I (Explicit Wiring) (3)
	
	private Hai hai;// S.I (Autowiring using ByName) (4)
	
//	public Hello() {
//		System.out.println("Hello -- D.C");
//	}
	
	public Hello(A aobj) { // This constructor will be called automatically by detecting the required parameters(A type bean)
		System.out.println("Hello -- 1 args -- C.I");
		this.aobj = aobj;
	}
	
//	@Autowired  // we can use @Autowired in both the places for same dependency 
//	public Hello(B bobj) { 
//		System.out.println("Hello -- 1 args -- C.I");
//		this.bobj = bobj;
//	}
	
//	public void setBobj(B bobj) {
//		System.out.println("This setter method will not be invoke");
//		this.bobj = bobj;
//	}

	public void setData(String data) {
		System.out.println(bobj); // to check the field injection is done or not
		System.out.println("setData() -- S.I -- Explicit Wiring");
		this.data = data;
	}
	
	public void setHai(Hai hai) {
		System.out.println(bobj); // to check the field injection is done or not
		System.out.println("setHai() -- S.I -- Autowiring byName");
		this.hai = hai;
	}

	public void show() {
		System.out.println("show in Hello");
		System.out.println(aobj);  // A [a=99, msg=Hello Guys]
		System.out.println(bobj);  // B [b=88, str=Hai Guys]
		System.out.println(data);  // Mahadev
		System.out.println(hai);   // Hai [phone=12345]
	}
}
