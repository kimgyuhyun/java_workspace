package sec03.exam04;
//객체 생성 시 생성자 선택
public class TestCarExample {
	public static void main(String[] args) {
		TestCar car1 = new TestCar();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		TestCar car2 = new TestCar("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		TestCar car3 = new TestCar("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		TestCar car4 = new TestCar("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}ㅓㅡ