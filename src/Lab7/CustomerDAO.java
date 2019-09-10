package Lab7;
// This DAO class is not design as singleton class but it should use as singleton only so,DAOFactory is responsible to create and maintain the singleton object of all DAO by providing instance factory method
public class CustomerDAO {
	static {
		System.out.println("CustomerDAO - S.B ");
	}
	public CustomerDAO() {
		System.out.println("CustomerDAO - D.C ");
	}
	
	// Other Methods
	
	public String toString() {
		return "I am CustomerDAO";
	}
	

}
