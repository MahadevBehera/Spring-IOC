package Lab33;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Annotation based Autowiring with @Autowired Example Using XML Based Configuration (Spring IOC)
// Multiple beans found for each type A & B, both bean will be injected without setter and constructor by using ByName(Field Injection)  
public class Lab33A {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/Lab33/myBeanFile.xml");
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}
}
