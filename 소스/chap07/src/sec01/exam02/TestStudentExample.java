package sec01.exam02;
//자식 객체 이용
public class TestStudentExample {
	public static void main(String[] args) {
		TestStudent student = new TestStudent("홍길동", "123456-1234567" , 1);
		System.out.println("name: " + student.name);  //부모에게 상속받은 필드 출력
		System.out.println("ssn: " + student.ssn);    //부모에게 상속받은 필드 출력
		System.out.println("studentNO: " + student.studentNo);
	}
}