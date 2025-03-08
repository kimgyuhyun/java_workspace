package sec01.exam04;
//구현 클래스
public class TestTelevision implements TestRemoteControl {
	//필드
	private int volume;
	
	//turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	//turnOFF() 추상 메소드의 실제 메소드
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	//setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) { //인터페이스 상수를 이용해서 volume 필드의 값을 제한
		if(volume>TestRemoteControl.MAX_VOLUME) { // volume 이 MAX_VOLUME보다 크면
			this.volume = TestRemoteControl.MAX_VOLUME; // 볼륨 필드에 MAX_VOLUME 상수를 넣어서 더 못올라가게 제한
		} else if(volume<TestRemoteControl.MIN_VOLUME) { // volume 이 MIN_VOLUME 보다 작으면
			this.volume = TestRemoteControl.MIN_VOLUME; // 볼륨 필드에 MIN_VOLUME 상수를 넣어서 더 못내려가게 제한
		} else { //둘다 아니면
			this.volume = volume; //매개값을 volume 필드에 저장
		}
		System.out.println("현재 TestTV 볼륨: " + this.volume);
	}
}
