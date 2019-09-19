package Lab14;

public class Hello {
	private A aobj; // S.I
	private B bobj; // S.I
	
	public void setAobj(A aobj) {
		System.out.println("Hello -- setAobj");
		this.aobj = aobj;
	}
	
	public void setBobj(B bobj) {
		System.out.println("Hello -- setBobj");
		this.bobj = bobj;
	}

	public void show() {
		System.out.println("show in Hello");
		System.out.println(aobj); // A [a=10, msg=AAA]
		System.out.println(bobj); // null
	}
}
