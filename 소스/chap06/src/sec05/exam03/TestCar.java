package sec05.exam03;
//정적 메소드 선언 시 주의할 점
public class TestCar {
	int speed; //인스턴스 필드
	
	void run() { //인스턴스 메소드
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) { //정적 메소드
		TestCar myCar = new TestCar();
		myCar.speed = 60;
		myCar.run();
	}
}
