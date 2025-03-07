package sec02.exam03;
//Tire 를 부품으로 가지는 클래스
public class TestCar {
	//필드
	TestTire frontLeftTire = new TestTire("앞왼쪽", 6);
	TestTire frontRightTire = new TestTire("앞오른쪽", 2);
	TestTire backLeftTire = new TestTire("뒤왼쪽", 3);       //자동차는 4개의 타이어를 가짐
	TestTire backRightTire = new TestTire("뒤오른쪽", 4);
	
	//생성자
	//메소드
	int run() { //모든 타이어를 1회 회전시키기 위해 각 Tire 객체의 roll() 메소드를 호출, false 를 리턴하는 roll()이 있을경우
		System.out.println("[자동차가 달립니다.]");	//stop() 메소드를 호출하고 해당 타이어 번호를 리턴
		if(frontLeftTire.roll()==false ) { stop(); return 1; }
		if(frontRightTire.roll()==false) { stop(); return 2; }
		if(backLeftTire.roll()==false)  { stop(); return 3; }
		if(backRightTire.roll()==false) { stop(); return 4; }
		return 0;
	}
	
	void stop() { //펑크 났을때 실행
		System.out.println("[자동차가 멈춥니다.]");
	}
}
