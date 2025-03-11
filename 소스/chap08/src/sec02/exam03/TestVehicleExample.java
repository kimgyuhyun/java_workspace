package sec02.exam03;
//강제 타입 변환
public class TestVehicleExample {
	public static void main(String[] args) {
		TestVehicle vehicle = new TestBus();
		
		vehicle.run();
		//vehicle.checkFare(); (x) Vehicle 인터페이스에는 checkFare()가 없음
		
		TestBus bus = (TestBus) vehicle; //강제 타입 변환
		
		bus.run();
		bus.checkFare();
	}
}
