package sec03.exam01;
//추상 클래스
public  abstract class TestPhone {
	//필드
	public String owner;
	
	//생성자
	public TestPhone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}