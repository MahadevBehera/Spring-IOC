package Lab10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MyBeanConfig2.class,MyBeanConfig3.class})
public class MyBeanConfig1 {

	@Bean
	public A createA() {
		A aobj = new A();
		aobj.setA(99);
		aobj.setMsg("Hello Guys");
		return aobj;
	}
}
