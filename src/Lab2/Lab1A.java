package Lab2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// First Spring Example Using Java Based Configuration (Spring IOC)
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
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------------------");
		Hello h = (Hello)ctx.getBean("hello"); // here "hello" refers to method name not bean ID. if Bean ID/name is specified then it will refer to bean name/ID
		h.show();
	}
}
