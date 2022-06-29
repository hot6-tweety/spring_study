package part06_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		String path = "part06_collection/di.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
//		Service svc1 = (Service) context.getBean("svc1");
//		svc1.prn1();
		
//		Service svc2 = (Service) context.getBean("svc2");
//		svc2.prn2();
		
//		Service svc3 = (Service) context.getBean("svc3");
//		svc3.prn3();
		
		Service svc4 = (Service) context.getBean("svc4");
		svc4.prn4();
		
	}

}
