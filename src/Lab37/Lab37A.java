package Lab37;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Annotation based Autowiring with @Autowired Example Using XML Based Configuration (Spring IOC)
// No bean found for each type A & B, both bean will not be injected because its specified as (required = false)  
public class Lab37A {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/Lab37/myBeanFile.xml");
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}
}
