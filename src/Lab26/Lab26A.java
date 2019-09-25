package Lab26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Autowiring - constructor Example Using XML Based Configuration (Spring IOC)
// More than one bean found of same type, So it will resolve using ByName
public class Lab26A {
	public static void main(String[] args) {
		
	//	ApplicationContext ctx = new ClassPathXmlApplicationContext(); // It will find the bean configuration XML file which default name "applicationContext.xml"
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/Lab26/myBeanFile.xml"); // to lead our own custom defined bean configuration XML file
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}
}
