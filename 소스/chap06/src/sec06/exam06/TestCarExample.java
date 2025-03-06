package sec06.exam06;
//Getter 와 SEtter 메소드 사용
public class TestCarExample {
	public static void main(String[] args) {
		TestCar myCar = new TestCar();
		
		//잘못된 속도 변경
		myCar.setSpeed(60);
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		//멈춤
		if(myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도: " + myCar.getSpeed());
	}
}