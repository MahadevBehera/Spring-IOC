package Lab9;

public class A {
	private int a;       // S.I
	private String msg;  // S.I
	
	public A() {
		System.out.println("A -- D.C");
	}

	public void setA(int a) {
		System.out.println("A -- setA()");
		this.a = a;
	}

	public void setMsg(String msg) {
		System.out.println("A -- setMsg()");
		this.msg = msg;
	}
	
	public void showA() {
		System.out.println("A -- showA()");
		System.out.println(a);
		System.out.println(msg);
	}
}
