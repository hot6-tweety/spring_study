package part08_lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
/* 1) BeanNameAware : 빈객체가 자신의 이름을 알아야 할때 사용한다.
 * 2) BeanFactoryAware : 빈 에 대한 정보를 알려준다.
 * 3) ApplicationContextAware : ApplicatonContext를 빈에 전달할때 사용한다.
 * 4) InitializingBean : 객체를 생성하고 프로퍼티를 초기화하고, 컨테이너에 관련 설정을 완료한 뒤에 실행된다.
 * 
 * 5) DisposableBean : 스프링 빈 객체를 컨테이너에서 제거하기 전에 DisposableBean인터페이스에
 * 					정의된 메소드를 호출하여 빈 객체가 자원을 반납할 수 있도록 하고 있다.
 * 
 * 
 */
public class ServiceImp implements Service,BeanNameAware,BeanFactoryAware ,ApplicationContextAware, InitializingBean ,DisposableBean{
	
	private String beanName;
	
	public ServiceImp() {
		System.out.println("constructor");
	}
	
	@Override
	public void setBeanName(String name) {
		this.beanName=name;
		System.out.println("beanName: " + beanName);
		
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("beanFactory :" + beanFactory.getBean(beanName));
		System.out.println("beanFactroy :" + beanFactory.getType(beanName));
		
	}
	
	public void before() {
		System.out.println("before");
	}
	
	@Override
	public void prn() {
		System.out.println("prn method");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
	
	public void end() {
		System.out.println("end");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("context : "+applicationContext.getBeanDefinitionCount());
		
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("빈 생성 완료");
		
	}
	
}
