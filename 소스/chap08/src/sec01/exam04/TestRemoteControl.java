package sec01.exam04;
//추상 메소드 선언
public interface TestRemoteControl {
	//상수
	public int MAX_VOLUME = 10; //public static final 생략
	public int MIN_VOLUME = 0;
	
	//추상 메소드
	public void turnOn(); //public abstract 생략
	public void turnOff();
	public void setVolume(int volume); //메소드 선언부만 작성
}