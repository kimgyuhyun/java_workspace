package sec05.exam05;

public class TestPersonExample {
	public static void main(String[] args) {
		TestPerson p1 = new TestPerson("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";
		//p1.ssn = "6654321-7654321";
		p1.name = "홍삼원";
				
	}
}
