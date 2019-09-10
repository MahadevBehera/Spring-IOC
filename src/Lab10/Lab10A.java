package Lab10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// @import Annotation Example Using Java Based Configuration (Spring IOC) (To import multiple bean config Java file)
public class Lab10A {
	public static void main(String[] args) {
		
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyBeanConfig1.class,MyBeanConfig2.class,MyBeanConfig3.class); // we can add multiple Java file here
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyBeanConfig1.class);
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}
}
