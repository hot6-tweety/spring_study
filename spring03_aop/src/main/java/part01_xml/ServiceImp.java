package part01_xml;

import java.util.Random;

//핵심 로직만 구현해놓은 클래스 - 핵심관점
public class ServiceImp implements Service{
	
	public ServiceImp() {

	}

	@Override
	public void prn1() {
		System.out.println("prn");
		
	}

	@Override
	public void prn1(int x) {
		System.out.println("x:"+ x);
		
	}

	@Override
	public void prn1(Random rn) {
		System.out.println(rn.nextDouble());
		
	}
	
	@Override
	public void prn1(int a, int b) {
		System.out.printf("a=%d, b=%d\n", a, b);
		
	}

	@Override
	public void prn2() {
		System.out.println("prn2");
		
	}

	@Override
	public String prn3() {
		System.out.println("prn3");
		return "홍길동";
	}

	@Override
	public void prn4() {
		System.out.println("prn4");
		String data="123";
		data="abc";
		int num = Integer.parseInt(data);
		System.out.println("num:" + num);
		
	}

	@Override
	public void prn5() {
		System.out.println("prn5");
		
	}

	
	
}
