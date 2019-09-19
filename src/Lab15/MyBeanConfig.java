package Lab15;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig {

	@Bean(name = "aobj")
	public A createA() {
		A aobj = new A();
		aobj.setA(99);
		aobj.setMsg("Hello Guys");
		return aobj;
	}
	
	@Bean(name = "bo")
	public B createB() {
		return new B(88, "Hai Guys");
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	public Hello hello() {
		Hello h = new Hello();
		return h;
	}
	
}
