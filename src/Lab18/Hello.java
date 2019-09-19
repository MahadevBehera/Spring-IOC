package Lab18;

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

	public void show() { // Exception will be thrown at the time of reading XML bean config file 
		System.out.println("show in Hello");
		System.out.println(aobj); 
		System.out.println(bobj); 
	}
}
