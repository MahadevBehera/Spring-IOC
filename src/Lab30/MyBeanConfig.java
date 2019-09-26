package Lab30;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig {

	/*
	  @Bean(name = "ao1")
	public A createA1() {
		A aobj = new A();
		aobj.setA(99);
		aobj.setMsg("Hello Guys");
		return aobj;
	}
	*/
	
	@Bean(name = "bo")
	public B createB() {
		return new B(77, "Hai Guys");
	}
	
	@Bean(autowire = Autowire.BY_TYPE)
	public Hello hello() {
		Hello h = new Hello();
		return h;
	}
	
}
