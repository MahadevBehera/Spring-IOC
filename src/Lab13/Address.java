package Lab13;

public class Address {
	private String city;    // C.I
	private String street;  // C.I
	private String state;	// C.I
	public Address(String city, String street, String state) {
		System.out.println("Address-3 arg");
		this.city = city;
		this.street = street;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", state=" + state + "]";
	}
	
}
