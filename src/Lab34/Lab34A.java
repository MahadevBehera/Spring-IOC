package Lab34;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Annotation based Autowiring with @Autowired Example Using Java Based Configuration (Spring IOC)
// Multiple beans found for each type A & B, both bean will be injected without setter and constructor by using ByName(Field Injection)  
public class Lab34A {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}
}
