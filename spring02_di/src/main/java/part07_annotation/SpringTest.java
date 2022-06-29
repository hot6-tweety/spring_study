package part07_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Service svc = (Service) context.getBean("svc");
		svc.prn();
		
		Service ss = (Service)context.getBean("ss");
		ss.prn();

	}

}
