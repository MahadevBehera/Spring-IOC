package Lab13;
import java.util.*;
import java.util.Map.Entry;

// Injecting various types of Bean Properties Using Java Configuration (Spring IOC)
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab12A {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------");
		Customer cust = (Customer)ctx.getBean("cust");
		System.out.println(cust);
		cust.show();
		
		Properties p = (Properties)ctx.getBean("systemProperties"); // To get existing Bean of Properties Type which is create by Spring IOC Container 
		Set<Entry<Object, Object>> set = p.entrySet();
		set.forEach(x -> System.out.println(x));
	}

}
