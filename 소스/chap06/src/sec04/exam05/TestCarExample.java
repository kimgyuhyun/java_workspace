package sec04.exam05;
//클래스 외부에서 메소드 호출
public class TestCarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); // 클래스로부터 객체를 생성하고 번지를 참조변수에 할당
		myCar.keyTurnOn(); //return 값이 없는 메소드 호출 참조변수.메소드(매개값,...);
		myCar.run(); // return 값이 없는 메소드 호출 
		int speed = myCar.getSpeed(); // return 값이 있는 메소드 호출 타입 변수 = 참조변수.메소드(매개값,...);
		System.out.println("현재 속도: " + speed + "km/h");
	}
}
