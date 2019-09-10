package Lab8;

// This Factory class is responsible to manage the singleton object of all DAO by providing instance factory methods
public class DAOFactory {

	private static CustomerDAO custdao = new CustomerDAO();
	private static AccountDAO accdao = new AccountDAO();
	
	// instance factory method given to get single CustomerDAO instance
	public CustomerDAO getCustomerDAOInstance() {
		System.out.println("instance factory method for CustomerDAO");
		return custdao;
	}
	
	// instance factory method given to get single AccountDAO instance
	public AccountDAO getAccountDAOInstance() {
		System.out.println("instance factory method for AccountDAO");
		return accdao;
	}
	
	
}
