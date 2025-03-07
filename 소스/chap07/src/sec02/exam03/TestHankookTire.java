package sec02.exam03;
//Tire 의 자식 클래스
public class TestHankookTire extends TestTire {
	//필드
	//생성자
	public TestHankookTire(String location, int maxRotatin) {
		super(location, maxRotatin); //부모 생성자를 호출할때 넘겨줌
	}
	//메소드
	@Override
	public boolean roll() { //다른 내용을 출력하기 위해 재정의한 roll() 메소드
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " TestHankookTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "TestHankookTire 펑크 ***");
			return false;
		}
	}
}
