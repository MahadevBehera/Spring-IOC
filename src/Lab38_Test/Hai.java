package Lab38_Test;

public class Hai {
	private int phone; // S.I

	public Hai() {
		System.out.println("Hai-- D.C");
	}

	public void setPhone(int phone) {
		System.out.println("Hai -- setPhone()");
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Hai [phone=" + phone + "]";
	}
	
	

}
