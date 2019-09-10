package Lab11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource({"Lab11/myBeanFile1.xml","Lab11/myBeanFile2.xml"}) // We can add multiple XML file here
public class MyBeanConfig {

	@Bean
	public Hello hello(A aobj, B bobj) {
		Hello h = new Hello(bobj);
		h.setAobj(aobj);
		return h;
	}
}
