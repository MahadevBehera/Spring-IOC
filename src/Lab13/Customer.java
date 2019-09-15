package Lab13;

import java.util.*;

public class Customer {
	
	// Primitive Type
	private int cid;				// C.I
	private String cname;			// C.I
	private String email;			// C.I
	
	// Wrapper Type
	private Long phone;				// C.I
	
	// List of Simple Types
	private List<String> emails;	// C.I
	// Set of Simple Types
	private Set<Long> phones;		// C.I
	
	// Map of Simple Type
	private Map<String, Long> refs;	// S.I
	// Properties Type
	private Properties myprops;		// S.I
	
	// Other Bean Type
	private Address address;		// C.I
	
	// Collection of Other Bean Types
	private List<Account> accounts;	// S.I

	public Customer(int cid, String cname, String email, Long phone, List<String> emails, Set<Long> phones,
			Address address) {
		System.out.println("Customer-7 arg");
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.emails = emails;
		this.phones = phones;
		this.address = address;
	}

	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}

	public void setMyprops(Properties myprops) {
		this.myprops = myprops;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	public void show() {
		System.out.println(emails);
		System.out.println(phones);
		System.out.println(refs);
		System.out.println(myprops);
		System.out.println(address);
		accounts.forEach(x -> System.out.println(x));
		
		System.out.println("---------------------------------");
		System.out.println(emails.getClass().getName());
		System.out.println(phones.getClass().getName());
		System.out.println(refs.getClass().getName());
		System.out.println(myprops.getClass().getName());
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + "]";
	}
	
}
