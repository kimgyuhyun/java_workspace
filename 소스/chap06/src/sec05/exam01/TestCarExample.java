package sec05.exam01;
//인스턴스 멤버와 this
public class TestCarExample {
	public static void main(String[] args) {
		TestCar myCar = new TestCar("포르쉐");
		TestCar yourCar = new TestCar("벤츠");
		
		myCar.run();
		yourCar.run();
	}
}