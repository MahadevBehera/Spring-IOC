package Lab9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// <import> tag Example Using XML Based Configuration (Spring IOC) (To import multiple bean XML file)
public class Lab9A {
	public static void main(String[] args) {
		
	//	ApplicationContext ctx = new ClassPathXmlApplicationContext(); // It will find the bean configuration XML file which default name "applicationContext.xml"
	//	ApplicationContext ctx = new ClassPathXmlApplicationContext("/Lab9/myBeanFile1.xml","/Lab9/myBeanFile2.xml","/Lab9/myBeanFile3.xml"); // We can add multiple files with comma separation
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/Lab9/myBeanFile1.xml"); // to lead our own custom defined bean configuration XML file
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}
}
