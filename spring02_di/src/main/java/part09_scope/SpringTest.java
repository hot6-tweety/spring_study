package part09_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		String path = "part09_scope/di.xml";
		ApplicationContext context= new ClassPathXmlApplicationContext(path);
		
		ServiceImp svc1 = (ServiceImp)context.getBean("svc1");
		System.out.print("svc1 ::");
		svc1.prn();
		
		
		ServiceImp svc2 = (ServiceImp)context.getBean("svc2");
		System.out.print("svc2 ::");
		svc2.prn();
		svc2.getUser().setId("여진구");
		svc2.getUser().setPass("40");
		
		svc1 = (ServiceImp)context.getBean("svc1");
		System.out.print("svc1 ::");
		svc1.prn();
		
		svc2 = (ServiceImp)context.getBean("svc2");
		System.out.print("svc2 ::");
		svc2.prn();
	}

}
