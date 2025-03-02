package sec04.exam01;
//메소드 선언
public class TestCalculator {

	//메소드
	void powerOn() { //리턴 타입 없으면 void
		System.out.println("전원을 켭니다");
	}
	
	int plus(int x, int y) { //리턴 타입 메소드이름(매개변수)
		int result = x + y; 
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
}
