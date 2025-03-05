package sec06.exam04.package1; //패키지가 동일
//생성자의 접근 제한(2)
public class TestB {
	//필드
	TestA a1 = new TestA(true); //(O)
	TestA a2 = new TestA(1);	//(O)
//	TestA a3 = new TestA("문자열"); //(X) private 생성자 접근 불가(컴파일 에러)
}