package sec05.exam04;
//싱글톤
public class TestSingleton {
	private static TestSingleton singleton = new TestSingleton(); //접근제한자와 정적 멤버 선언 클래스 참조변수 = 클래스 객체생성
	
	private TestSingleton() {} //생성자
	
	static TestSingleton getInstance() {
		return singleton;
	}
}
