package Lab7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// instantiation with a Static factory and Instance factory Method Using XML Based Configuration
public class Lab7A {
	public static void main(String[] args) {
		
	//	ApplicationContext ctx = new ClassPathXmlApplicationContext(); // It will find the bean configuration XML file which default name "applicationContext.xml"
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/Lab7/myBeanFile.xml"); // to lead our own custom defined bean configuration XML file
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
