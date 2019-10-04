package Lab35;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Annotation based Autowiring with @Autowired on top of Constructor Example Using XML Based Configuration (Spring IOC)
// Exactly one bean found for each type A & B, both bean will be injected with constructor (Field Injection)  
public class Lab35A {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/Lab35/myBeanFile.xml");
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}
}
