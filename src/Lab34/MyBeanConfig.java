package Lab34;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig {

	
	@Bean(name = "ao1")
	public A createA1() {
		A aobj = new A();
		aobj.setA(99);
		aobj.setMsg("Hello Guys");
		return aobj;
	}
	@Bean(name = "ao2")
	public A createA2() {
		A aobj = new A();
		aobj.setA(88);
		aobj.setMsg("Hello Guys");
		return aobj;
	}
	
	
	@Bean(name = "bo1")
	public B createB1() {
		return new B(77, "Hai Guys");
	}
	@Bean(name = "bo2")
	public B createB2() {
		return new B(66, "Hai Guys");
	}
	
	@Bean
	public Hello hello() {
		Hello h = new Hello();
		return h;
	}
	
}
