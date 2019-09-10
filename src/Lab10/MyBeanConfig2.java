package Lab10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig2 {

	
	@Bean
	public B createB() {
		return new B(88, "Hai Guys");
	}
}
