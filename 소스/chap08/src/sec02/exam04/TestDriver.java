package chap08.src.sec02.exam04;
//객체 타입 확인
public class TestDriver {
	public void drive(TestVehicle vehicle) {
		if(vehicle instanceof TestBus) { //vehicle 매개 변수가 참조하는 객체가 TestBus 인지 조사
			TestBus bus = (TestBus) vehicle; //TestBus 객체일 경우 안전하게 강제 타입 변환
			bus.checkFare(); //TestBus 타입으로 강제 타입 변환을 하는 이유
		}
		vehicle.run();
	}
}
