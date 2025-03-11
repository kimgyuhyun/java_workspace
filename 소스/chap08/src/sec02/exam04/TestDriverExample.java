package sec02.exam04;
//객체 타입 확인
public class TestDriverExample {
	public static void main(String[] args) {
		TestDriver driver = new TestDriver();
		
		TestBus bus = new TestBus();
		TestTaxi taxi = new TestTaxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
