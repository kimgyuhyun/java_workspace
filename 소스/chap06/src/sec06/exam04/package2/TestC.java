package sec06.exam04.package2;
//생성자의 접근 제한(3)
import sec06.exam04.package1.TestA;
public class TestC {
	//필드
	TestA a1 = new TestA(true); //(O)
//	TestA a2 = new TestA(1);	//(X) default 생성자 접근 불가(컴파일 에러)
//	TestA a3 = new TestA("문자열");//(X) private 생성자 접근 불가(컴파일 에러)
}
