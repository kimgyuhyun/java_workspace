package sec02.exam02;
//자동 타입 변환 후의 멤버 접근
public class TestChildExample {
	public static void main(String[] args) {
		TestChild child = new TestChild();
		
		TestParent parent = child;
		parent.method1();
		parent.method2(); //재정의된 TestChild에 method2가 호출
		//parent.method3(); //호출 불가능
	}
}