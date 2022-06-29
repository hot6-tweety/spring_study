package part08_lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		String path= "part08_lifecycle/di.xml";
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(path);
		Service svc = (Service)context.getBean("svc");
		svc.prn();
		
		//컨테이너 종료
		context.close();
		
	}

}
