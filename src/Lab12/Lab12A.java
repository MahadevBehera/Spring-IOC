package Lab12;
// Injecting various types of Bean Properties Using XML Configuration (Spring IOC)
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab12A {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/Lab12/myBeanFile.xml");
		System.out.println("Spring Container is Ready");
		System.out.println("------------------------------");
		Customer cust = (Customer)ctx.getBean("cust");
		System.out.println(cust);
		cust.show();
	}

}
