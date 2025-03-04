package sec05.exam05;
//final 필드 선언과 초기화
public class TestPerson {
	final String nation = "kroea"; //final 필드와 값 선언
	final String ssn; //객체가 생성될 때 값이 부여되므로 초기값 없이 선언
	String name;
	
	public TestPerson(String ssn, String name) { //생성자
		this.ssn = ssn;
		this.name = name;
	}
}