package sec03.exam02;
//추상 메소드 선언
public abstract class TestAnimal { //추상 클래스
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); //추상 메소드
}