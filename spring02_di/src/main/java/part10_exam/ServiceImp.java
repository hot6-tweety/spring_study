package part10_exam;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ServiceImp implements Service{
	private List<String> list;
	
	public ServiceImp() {
	
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public void prn() {
		TreeSet<String> tSet = new TreeSet<String>(list);
		while(!tSet.isEmpty()) {
			System.out.println(tSet.pollFirst());
		}
			
	}
	
}
