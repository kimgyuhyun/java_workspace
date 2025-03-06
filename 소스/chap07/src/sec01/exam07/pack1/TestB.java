package sec01.exam07.pack1;
//protected 접근 제한자 테스트
public class TestB {
	public void method() {
		TestA a = new TestA(); // 생성자 접근 가능
		a.field = "value"; //필드 접근 가능
		a.method(); //메소드 접근 가능
	}
}