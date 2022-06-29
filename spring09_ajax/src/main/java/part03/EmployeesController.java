package part03;

// http://localhost:8090/myapp/empsearch.do
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

// @RestController = @Controller + @ResponseBody


@Controller
public class EmployeesController {
	private EmployeesDAO dao;
	public EmployeesController() {
	
	}
	public void setDao(EmployeesDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value="/empsearch.do", method=RequestMethod.GET)
	public String execute() {
		return "part03/empList";
	}
	
	@ResponseBody
	@RequestMapping(value="/empsearch.do", method=RequestMethod.POST)
	public List<EmployeesDTO> process(String data){
		System.out.println(dao.search(data));
		return dao.search(data);		
	}

}
