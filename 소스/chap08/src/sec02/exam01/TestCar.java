package sec02.exam01;
//필드 다형성
public class TestCar {
	TestTire frontLeftTire = new TestHankookTire(); //인터페이스 타입 필드 선언과 초기 구현 객체 대입
	TestTire frontRightTire = new TestHankookTire();
	TestTire backLeftTire = new TestHankookTire();
	TestTire backRightTire = new TestHankookTire();
	
	void run() {
		frontLeftTire.roll(); //인터페이스 설명된 roll() 메소드 호출
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}