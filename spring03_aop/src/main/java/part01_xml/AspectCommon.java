package part01_xml;

import org.aspectj.lang.ProceedingJoinPoint;

//공통로직만 구현해놓은 클래스 - 공통관점
public class AspectCommon {
	public AspectCommon() {
		
	}
	
	public void comm1() {
		System.out.println("before");
	}
	
	public void comm2() {
		System.out.println("after");
	}
	
	public void comm3(String name) {
		System.out.println(name);
	}
	
	public void comm4(Exception ex) {
		System.out.println("comm4 : " + ex);
	}
	
	public void comm5(ProceedingJoinPoint point ) {
		System.out.println("comm5 start");
		try {
			point.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("comm5 end");
	}
	
}//end class
