package Lab16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Autowiring - ByType Example Using XML Based Configuration (Spring IOC)
// Exactly one bean is found with matching Data Type for each dependency of Hello Bean
public class Lab16A {
	public static void main(String[] args) {
		
	//	ApplicationContext ctx = new ClassPathXmlApplicationContext(); // It will find the bean configuration XML file which default name "applicationContext.xml"
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/Lab16/myBeanFile.xml"); // to lead our own custom defined bean configuration XML file
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}
}
