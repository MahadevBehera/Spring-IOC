package Lab21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Autowiring - ByType Example Using Java Based Configuration (Spring IOC)
//  A Type bean is found more than one with matching Data Type So not able to inject Dependency and will Throw Exception 
public class Lab21A {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}
}
