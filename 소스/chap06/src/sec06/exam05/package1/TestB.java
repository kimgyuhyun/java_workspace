package sec06.exam05.package1; //패키지가 동일
//필드와 메소드의 접근 제한(2)
public class TestB {
	public TestB() {
		TestA a = new TestA();
		a.field1 = 1; //(O)
		a.field2 = 1; //(O)
//		a.field3 = 1; //(X) private 필드 접근 불가(컴파일 에러)
		
		a.method1(); //(O)
		a.method2(); //(O)
//		a.method3(); //(X) pirvate 메소드 접근 불가(컴파일 에러)
	}
}