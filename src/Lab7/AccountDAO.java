package Lab7;
// This DAO class is not design as singleton class but it should use as singleton only so,DAOFactory is responsible to create and maintain the singleton object of all DAO by providing instance factory method
public class AccountDAO {
	static {
		System.out.println("AccountDAO - S.B ");
	}
	public AccountDAO() {
		System.out.println("AccountDAO - D.C ");
	}
	
	// Other Methods
	
	public String toString() {
		return "I am AccountDAO";
	}
	

}
