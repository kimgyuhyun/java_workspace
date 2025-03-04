package sec05.exam01;
//인스턴스 멤버와 this
public class TestCar {
	//필드
	String model; // String 타입의 인스턴스 필드 model 을 선언
	int speed; // int 타입의 인스턴스 필드 speed 를 선언
	
	//생성자
	TestCar(String model) { //String model 을 받아서 객체를 초기화, 용도 TestCar 객체를 만들 때 모델명을 설정해줌.
		this.model = model; // 매개변수 model 값을 필드 model 에 저장
	}
	
	//메소드
	void setSpeed(int speed) { //매개변수 int speed 를 메소드 setSpeed에 할당
		this.speed = speed; // 매개변수 speed 를 필드 speed 에 저장
	}

	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i); //setSpeed 메소드를 호출해서 i 값으로 속도를 설정
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}
	}
}