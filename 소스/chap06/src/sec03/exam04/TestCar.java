package sec03.exam04;
//다른 생성자를 호출해서 중복 코드 줄이기
public class TestCar {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	TestCar() {
	}
	
	TestCar(String model) {
		this(model, "은색", 250);                    //호출
	}
	
	TestCar(String model, String color) {           //호출
		this(model,color, 250);
	}
	
	TestCar(String model, String color, int maxSpeed) {     //2,3번 생성자가 마지막 생성자를 호출함
		this.model = model;                          //공통 실행코드
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}

