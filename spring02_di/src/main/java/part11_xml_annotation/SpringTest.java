package part11_xml_annotation;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("part11_xml_annotation/di.xml");
        
		 Random ran=(Random)context.getBean("ran");
	        System.out.println("난수:"+ran.nextDouble());
	        
	        String alpa=(String)context.getBean("alpa");
	        System.out.println("alpa:"+alpa);
	}//end main()

}//end class





