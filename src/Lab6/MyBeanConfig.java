package Lab6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyBeanConfig {

	@Bean
	@Scope("singleton")
	@Lazy(true)
	public Hello hello() {
		System.out.println("hello method");
		return new Hello();
	}
	
}
