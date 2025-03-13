package chap08.src.sec02.exam04;
//구현 클래스
public class TestBus implements TestVehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}