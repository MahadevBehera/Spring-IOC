package Lab8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// instantiation with a Static factory and Instance factory Method Using Java Based Configuration
public class Lab8A {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		
		Runtime rt = (Runtime)ctx.getBean("rt");
		Hello hello = (Hello)ctx.getBean("hello");
		CustomerDAO custdao = (CustomerDAO)ctx.getBean("custdao");
		AccountDAO accdao = (AccountDAO)ctx.getBean("accdao");
		
		System.out.println(rt);
		System.out.println(hello);
		System.out.println(custdao);
		System.out.println(accdao);
	}
}
