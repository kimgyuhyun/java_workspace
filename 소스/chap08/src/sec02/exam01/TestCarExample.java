package sec02.exam01;
//필드 다형성 테스트
public class TestCarExample {
	public static void main(String[] args) {
		TestCar myCar = new TestCar();
		
		myCar.run();
		
		myCar.frontLeftTire = new TestKumhoTire(); //TestCar 객체의 필드에 다른 구현 객체를 대입 자동 타입변환되어 할당
		myCar.frontRightTire = new TestKumhoTire();
		
		myCar.run();
	}
}
