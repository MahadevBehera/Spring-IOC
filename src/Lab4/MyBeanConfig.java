package Lab4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyBeanConfig {

	@Bean
	//@Scope("prototype")
	public Hello hello() {
		System.out.println("hello method");
		return new Hello();
	}
	
}
