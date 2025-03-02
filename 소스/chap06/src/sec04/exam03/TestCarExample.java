package sec04.exam03;
// return 문
public class TestCarExample {
	public static void main(String[] args) {
		TestCar myCar = new TestCar();
		
		myCar.setGas(5); // TestCar의 setGas() 메소드 호출
		
		boolean gasState = myCar.isLeftGas(); // TestCar의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다");
			myCar.run(); //TestCar의 run() 메소드 호출
		}
		
		if(myCar.isLeftGas()) { //TestCar의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할  필요가 없습니다");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
