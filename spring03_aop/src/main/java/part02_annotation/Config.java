package part02_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAspectJAutoProxy
//@ImportResource({"classpath:part02_annotation/aop.xml"})
public class Config {
	public Config() {
	
	}
	
	@Bean
	public ServiceImp svc() {
		return new ServiceImp();
	}
	
	@Bean
	public AspectCommon common() {
		return new AspectCommon();
	}
}
