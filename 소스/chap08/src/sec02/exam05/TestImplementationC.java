package sec02.exam05;
//하위 인터페이스 구현
public class TestImplementationC implements TestInterfaceC {
	public void methodA() { //TestInterfaceA와 TestInterfaceB의 실체 메소드도 있어야함
		System.out.println("TestImplementationC-methodA() 실행");
	}
	
	public void methodB() { //TestInterfaceA와 TestInterfaceB의 실체 메소드도 있어야함
		System.out.println("TestImplementationC-methodB() 실행");
	}
	
	public void methodC() {
		System.out.println("TestImplementationC-methodC() 실행");
	}
}
