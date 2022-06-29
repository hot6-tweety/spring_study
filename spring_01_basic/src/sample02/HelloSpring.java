package sample02;

public class HelloSpring {

	public static void main(String[] args) {
		MessageBean bean = null;
		//bean = new MessageBeanKorea();
		//bean.sayHello("스프링");
		
		bean = new MessageBeanEnglish();
		bean.sayHello("Spring");
	}

}
