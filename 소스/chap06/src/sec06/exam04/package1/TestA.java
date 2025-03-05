package sec06.exam04.package1;
//생성자의 접근 제한(1)
public class TestA {
	//필드
	TestA a1 = new TestA(true);
	TestA a2 = new TestA(1);
	TestA a3 = new TestA("문자열");
	
	
	//생성자
	public TestA(boolean b) {} //public 접근 제한
	TestA(int b) {} //default 접근 제한
	private TestA(String s) {} //private 접근 제한
}