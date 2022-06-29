package part02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// http://localhost:8090/myapp/noticeList.do
@Controller
public class NoticeController {
	
	@RequestMapping("/noticeList.do")
	public String process() {
	 return "part02/noticeList";	
	}

}
