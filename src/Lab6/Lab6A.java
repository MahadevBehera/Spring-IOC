package Lab6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Bean Loading Example Using Java Based Configuration (Spring IOC)
public class Lab6A {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		Hello h1 = (Hello)ctx.getBean("hello");
		Hello h2 = (Hello)ctx.getBean("hello");
		System.out.println(h1 == h2); // true , if scope is singleton 
									  // false, if scope is prototype
	}
}
