package Lab38_Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// All type of wiring with Example Using XML Based Configuration (Spring IOC)
// This example to check order of injection (constructor injection --> field injection --> explicit setter injection --> autowiring setter injection)
public class Lab38A_Test {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/Lab38_Test/myBeanFile.xml");
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}
}
