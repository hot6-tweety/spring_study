package part03_exam;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class StopWatchAspect {
	
	public StopWatchAspect() {
	
	}
	
	@Around(value="execution(* part03_exam.ServiceImp.prn())")
	public void process(ProceedingJoinPoint point) {
		long start = System.currentTimeMillis();
		
		try {
			point.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		
		String time = point.getSignature().getName() + "__메서드 실행시간:" + (end-start);
		System.out.println(time);
	}//end process()

}
