package Lab12;

public class Account {
	private int accno;		// S.I
	private String atype;	// S.I
	private double bal;		// S.I
	
	private Account() {
		System.out.println("Account-D.C");
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", atype=" + atype + ", bal=" + bal + "]";
	}
	
}
