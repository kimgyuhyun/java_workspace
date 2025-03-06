package sec01.exam04;
//super 변수
public class TestSupersonicAirplaneExample {
	public static void main(String[] args) {
		TestSupersonicAirplane sa = new TestSupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = TestSupersonicAirplane.SUPERSONIC; // flyMode 필드에 TestSupersonic 클래스의 상수를 저장 정적멤버라 클래스.필드이름으로 접근해야함
		sa.fly();
		sa.flyMode = TestSupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}