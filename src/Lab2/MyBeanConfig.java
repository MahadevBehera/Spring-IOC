package Lab2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig {

	@Bean
	public Hello hello(A aobj, B bobj) {
		Hello h = new Hello(bobj);
		h.setAobj(aobj);
		return h;
	}
	
	@Bean(name = "ao")
	public A createA() {
		A aobj = new A();
		aobj.setA(99);
		aobj.setMsg("Hello Guys");
		return aobj;
	}
	
	@Bean
	public B createB() {
		return new B(88, "Hai Guys");
	}
}
