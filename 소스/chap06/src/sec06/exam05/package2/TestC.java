package sec06.exam05.package2;//패키지가 다름
//필드와 메소드와 접근 제한(3)
import sec06.exam05.package1.TestA;

public class TestC {
	public TestC() {
		TestA a = new TestA();
		a.field1 = 1; //(O)
//		a.field2 = 1; //(O) default 필드 접근 불가(컴파일 에러)
//		a.field3 = 1; //(X) private 필드 접근 불가(컴파일 에러)
		 
		a.method1(); //(O) 
//		a.method2(); //(X) default 메소드 접근 불가(컴파일 에러)
//		a.method3(); //(X) private 메소드 접근 불가(컴파일 에러)
	}
}