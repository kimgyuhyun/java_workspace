package sec04.exam05;
//클래스 외부에서 메소드 호출
public class TestCar {
	//필드
	int speed;
	
	//생성자
	
	//메소드
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for( int i=10; i<=50; i+=10) { // i 가 50보다 작거나 같을때
			speed = i; // 필드에 i 값을 더함
			System.out.println("달립니다.(시속:" + speed + "km/h");
		}
	}
}
