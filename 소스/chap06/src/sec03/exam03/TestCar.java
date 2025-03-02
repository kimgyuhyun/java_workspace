package sec03.exam03;

public class TestCar {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	TestCar() {	            //1 생성자
	}
	
	TestCar(String model) {
		this.model = model;
	}
	
	TestCar(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	TestCar(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
