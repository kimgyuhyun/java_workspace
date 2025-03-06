package sec01.exam06;
//재정의할 수 없는 final 메소드
public class TestSportsCar extends TestCar {
	@Override
	public void speedUp() { speed += 10; }
	
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤"); //부모 클래스에서 final 메소드로 선언되어있으므로 재정의 할 수 없음
//		speed = 0;
//	}
}
