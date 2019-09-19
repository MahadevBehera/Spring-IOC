package Lab18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Autowiring - ByType Example Using XML Based Configuration (Spring IOC)
// A Type bean is found more than one with matching Data Type So not able to inject Dependency and will Throw Exception
public class Lab18A {
	public static void main(String[] args) {
		
	//	ApplicationContext ctx = new ClassPathXmlApplicationContext(); // It will find the bean configuration XML file which default name "applicationContext.xml"
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/Lab18/myBeanFile.xml"); // to lead our own custom defined bean configuration XML file
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}
}
