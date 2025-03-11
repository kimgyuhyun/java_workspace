package sec02.exam02;
//매개 변수의 다형성 테스트
public class TestDriverExample {
	public static void main(String[] args) {
		TestDriver driver = new TestDriver(); //객체생성
		
		TestBus bus = new TestBus();
		TestTaxi taxi = new TestTaxi();
		
		driver.drive(bus); //자동 타입 변환:TestVehicle vehicle = bus;
		driver.drive(taxi);//자동 타입 변환:TestVehicle vehicle = taxi;
	}
}
