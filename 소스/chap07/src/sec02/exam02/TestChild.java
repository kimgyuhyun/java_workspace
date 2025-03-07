package sec02.exam02;
//자동 타입 변환 후의 멤버 접근
public class TestChild extends TestParent{
	@Override
	public void method2() {
		System.out.println("TestChild-method2()"); //재정의
	}
	
	public void method3() {
		System.out.println("TestChild-method3()");
	}
}