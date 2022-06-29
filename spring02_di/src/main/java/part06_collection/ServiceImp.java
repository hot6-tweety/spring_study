package part06_collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ServiceImp implements Service{
	
	private List<Integer> list;
	private Map<String, Integer> map;
	private Set<String> set;
	private Properties prop;
	
	
	public ServiceImp() {

	}
	
	




	@Override
	public void prn1() {
		for(Integer it :list)
			System.out.println(it);	
	}

	@Override
	public void prn2() {
		Set<String> set = map.keySet();
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String key = ite.next();
			System.out.printf("%s : %d\n",key, map.get(key));
		}
	}

	@Override
	public void prn3() {
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String key = ite.next();
			System.out.printf("%s\n",key);
		}
		
	}

	@Override
	public void prn4() {
		Set<Object> set = prop.keySet();
		Iterator<Object> ite = set.iterator();
		while(ite.hasNext()) {
			Object key = ite.next();
			System.out.printf("%s : %s\n",key, prop.get(key));
		}
		
	}
	
	public ServiceImp(List<Integer> list) {
		super();
		this.list = list;
	}
	
	
	
	public ServiceImp(Properties prop) {
		super();
		this.prop = prop;
	}
	
	
	
	public ServiceImp(Set<String> set) {
		super();
		this.set = set;
	}
	
	
	
	public ServiceImp(Map<String, Integer> map) {
		super();
		this.map = map;
	}
	
}
