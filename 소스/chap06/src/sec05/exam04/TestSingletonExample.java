package sec05.exam04;
//싱글톤 객체
public class TestSingletonExample {
	public static void main(String[] args) {
		/*
		  Singleton obj1 = new Singleton();	<< 싱글톤 클래스는 외부에서 new 연산자로 객체생성이 불가함으로 컴파일 에러
		  Singleton obj2 = new Singleton();   
	    */
		
		TestSingleton obj1 = TestSingleton.getInstance();
		TestSingleton obj2 = TestSingleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 SIngleton 객쳉립니다.");
		}
	}
}