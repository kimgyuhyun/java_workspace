package sec02.exam04;
//실행 클래스
public class TestDriverExample {
	public static void main(String[] args) {
		TestDriver driver = new TestDriver();
		
		TestBus bus = new TestBus();
		TestTaxi taxi = new TestTaxi();
		
		driver.drive(bus); //자동 타입 변환:Vehicle vehicle = bus;
		driver.drive(taxi); //자동 타입 변환:Vehicle vehicle = taxi;
	}
}