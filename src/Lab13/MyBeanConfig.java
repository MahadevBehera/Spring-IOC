package Lab13;

import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig {
	@Bean
	public List<String> emails(){
		List<String> emails = new ArrayList<String>();
		emails.add("aa@gmail");
		emails.add("bb@gmail");
		emails.add("cc@gmail");
		return emails;
	}
	
	@Bean
	public Set<Long> phones(){
		Set<Long> phones = new LinkedHashSet<>();
		phones.add(1111L);
		phones.add(2222L);
		phones.add(3333L);
		return phones;
	}
	
	@Bean(name = "refs")
	public Map<String, Long> references(){
		Map<String, Long> refs = new LinkedHashMap<String, Long>();
		refs.put("AA", 111L);
		refs.put("BB", 222L);
		refs.put("CC", 333L);
		return refs;
	}
	
	@Bean(name = "myProps") // By default Spring container already have one Bean of Properties type named "systemProperties", Thats why its got confused so we have to give name as parameter name of customer method to resolve it as ByName
	public Properties myProperties() {
		Properties props = new Properties();
		props.put("DD", 444);
		props.put("EE", 555);
		props.put("FF", 666);
		return props;
	}
	
	@Bean
	public Address address() {
		return new Address("Bangalore", "BTM", "KA");
	}
	
	@Bean(name = "acc1")
	public Account account1() {
		Account acc1 = new Account();
		acc1.setAccno(101);
		acc1.setAtype("SA");
		acc1.setBal(10000.00);
		return acc1;
	}
	
	@Bean(name = "acc2")
	public Account account2() {
		Account acc2 = new Account();
		acc2.setAccno(102);
		acc2.setAtype("SA");
		acc2.setBal(20000.00);
		return acc2;
	}
	
	@Bean(name = "acc3")
	public Account account3() {
		Account acc3 = new Account();
		acc3.setAccno(103);
		acc3.setAtype("CA");
		acc3.setBal(35000.00);
		return acc3;
	}
	
	// 1) we can get List of Accounts like this
	/*@Bean
	public List<Account> accounts(){
		System.out.println("No arg");
		List<Account> accounts = new ArrayList<>();
		
		Account acc2 = new Account();
		acc2.setAccno(102);
		acc2.setAtype("SA");
		acc2.setBal(300000.00);
		
		accounts.add(account1()); // 1st way
		accounts.add(acc2);       // 2nd way 
		accounts.add(account3());
		
		return accounts;
	}
	*/
	// 2) we can get List of Accounts like this
	@Bean(name = "accounts")
	public List<Account> accounts(Account acc1, Account acc2, Account acc3){ // By default it will find byType if multiple Account type bean will found then it will go for byName(local variable name which is in method parameter), if it can't resolve by name also then it will throw exception.
		System.out.println("3 arg");
		List<Account> accounts = new ArrayList<>();
		accounts.add(acc1);		  // 3rd way
		accounts.add(acc2);        
		accounts.add(acc3);
		
		return accounts;
	}
	
	@Bean(name = "cust")
	public Customer customer(Address add, List<String> emails, Set<Long> phones, Map<String,Long> refs,
							 Properties myProps,List<Account> accounts) {
		Customer cust = new Customer(101, "Dev", "dev@gmail", 111111L, emails, phones, add);
		cust.setRefs(refs);
		cust.setMyprops(myProps);
		cust.setAccounts(accounts);
		
		return cust;
	}
}
