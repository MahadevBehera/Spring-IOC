package Lab30;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Injecting Sub type into super type reference Example Using Java Based Configuration (Spring IOC)
// B type bean which is sub type of A type bean will be injected to the Dependency of Hello  
public class Lab30A {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}
}
