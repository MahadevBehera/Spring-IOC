package Lab32;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig {

	
	  @Bean(name = "ao")
	public A createA() {
		A aobj = new A();
		aobj.setA(99);
		aobj.setMsg("Hello Guys");
		return aobj;
	}
	
	
	@Bean(name = "bo")
	public B createB() {
		return new B(77, "Hai Guys");
	}
	
	@Bean
	public Hello hello() {
		Hello h = new Hello();
		return h;
	}
	
}
