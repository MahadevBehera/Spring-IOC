package Lab8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig {
	
	@Bean(name = "rt")
	public Runtime getRT() {
		return Runtime.getRuntime();
	}

	@Bean(name = "hello")
	public Hello getHello() {
		return Hello.createHelloInstance();
	}
	
	@Bean
	public DAOFactory getDAOFactory() {
		return new DAOFactory();
	}
	
	@Bean(name = "custdao")
	public CustomerDAO getCustDAO(DAOFactory daoFactory) {
		return daoFactory.getCustomerDAOInstance();
	}
	@Bean(name = "accdao")
	public AccountDAO getAccDAO(DAOFactory daoFactory) {
		return daoFactory.getAccountDAOInstance();
	}
}
