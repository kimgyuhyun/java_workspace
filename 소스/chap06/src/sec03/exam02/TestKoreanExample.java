package sec03.exam02;
//객체 생성 후 필드값 출력
public class TestKoreanExample {
	public static void main(String[] args) {
		TestKorean k1 = new TestKorean("박자바", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		TestKorean k2 = new TestKorean("김자바", "930525-0654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}
