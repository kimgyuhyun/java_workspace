package sec05.verify.exam01;

public class TestShopService {
	private static TestShopService singleton = new TestShopService(); //접근 제한자와 정적멤버 선언 클래스 참조변수 = 객체생성
	
	private TestShopService() {} //private 를 붙여 외부에서 생성자 호출을 못하게함
	
	static TestShopService getInstance() {
		return singleton;
	}
}
