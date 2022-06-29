package part07_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//현재 클래스(Config)를 스프링 환경설정으로 사용함을 의미한다.
@Configuration
public class Config {
	public Config() {
		
	}
	
	/* ****************xml****************
	 * <bean id="user" class="part07_annotation.User">
	 * 	<constructor-arg>
	 * 		<value>kim</value>
	 * 		<value>a1234</value>
	 * 	</constructor-arg>
	 * </bean>
	 * <bean id="svc" class="part07_annotation.ServiceImp">
	 * 	<constructor-arg>
	 * 		<ref bean="user" />
	 * 	</constructor-arg>
	 * </bean>
	 */
	
	
	@Bean
	public User user() {
		return new User("kim","a1234");
	}
	
	//@Bean을 선언할때 이름속성을 지정하지 않으면 메소드명이 빈ID가 된다.
	
	@Bean
	public ServiceImp svc() {
		return new ServiceImp(user());
	}

	//@Bean을 선언할 때 name속성을 지정하면 name속성의 값이 빈 ID가 된다.
	@Bean(name="ss")
	public ServiceImp smp() {
		return new ServiceImp(user());
	}
}
