package Lab20;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Autowiring - ByType Example Using Java Based Configuration (Spring IOC)
// No bean found with matching Data Type for each dependency of Hello Bean, So remains uninjected 
public class Lab20A {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}
}
