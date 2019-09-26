package Lab29;

public class Hello {
	private A aobj; // S.I

	public Hello() {
		System.out.println("Hello-()");
	}

	public void setAobj(A aobj) {
		System.out.println("Hello-setAobj()");
		this.aobj = aobj;
	}

	public void show() {
		System.out.println("show in Hello");
		System.out.println(aobj); // B [b=88, str=Hai Guys]
	}
}
