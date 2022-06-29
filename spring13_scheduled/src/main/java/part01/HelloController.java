package part01;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
  
	@RequestMapping("/main.do")
	public String execute() {
		return "part01/form";
	}
	
	//1초마다 콘솔에 출력
	//@Scheduled(fixedDelay = 1000)
	public void scheduledProcess() {
		System.out.println(new Date() + "스케줄링 처리완료");
	}
}
