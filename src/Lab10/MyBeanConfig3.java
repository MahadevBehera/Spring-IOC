package Lab10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig3 {

	@Bean
	public Hello hello(A aobj, B bobj) {
		Hello h = new Hello(bobj);
		h.setAobj(aobj);
		return h;
	}
}
