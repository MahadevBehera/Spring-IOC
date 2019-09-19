package Lab20;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig {

	
	@Bean(autowire = Autowire.BY_TYPE)
	public Hello hello() {
		Hello h = new Hello();
		return h;
	}
	
}
