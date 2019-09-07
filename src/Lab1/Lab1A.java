package Lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// First Spring Example Using XML Based Configuration (Spring IOC)
public class Lab1A {
	public static void main(String[] args) {
		/*
		// Without IOC
		A aobj = new A();
		aobj.setA(99);
		aobj.setMsg("Hello Guys");
		
		B bobj = new B(88, "Hai Guys");
		
		Hello h = new Hello(bobj);
		h.setAobj(aobj);
		h.show();
		
		*/
	//	ApplicationContext ctx = new ClassPathXmlApplicationContext(); // It will find the bean configuration XML file which default name "applicationContext.xml"
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/Lab1/myBeanFile.xml"); // to lead our own custom defined bean configuration XML file
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}
}
