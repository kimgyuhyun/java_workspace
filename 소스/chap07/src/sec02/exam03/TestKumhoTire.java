package sec02.exam03;
//Tire 의 자식 클래스
public class TestKumhoTire extends TestTire {
	//필드
	//생성자
	public TestKumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "TestKumhoTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "TestKumhoTire 펑크 ***");
			return false;
		}
	}
}
