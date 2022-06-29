package part02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	public IndexController() {
	
	}
	
	@RequestMapping("/index.do")
    public String process() {
		return "part02/index";
	}
}
