package sec01.exam02;
//자식 클래스
public class TestStudent extends TestPeople {
	public int studentNo;
	
	public TestStudent(String name, String ssn, int studentNo) {
		super(name, ssn); //부모 생성자 호출
		this.studentNo = studentNo;
	}
}