package sec02.exam02;
//구현 클래스
public class TestBus implements TestVehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
