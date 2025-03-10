package sec01.exam05;
//다중 인터페이스 구현 클래스
public class TestSmartTelevision implements TestRemoteControl, TestSearchable {
	private int volume;

	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volume) { //TestRemoteControl에 대한 실체 메소드
		if(volume>TestRemoteControl.MAX_VOLUME) {
			this.volume = TestRemoteControl.MAX_VOLUME;
		} else if(volume<TestRemoteControl.MIN_VOLUME) {
			this.volume = TestRemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	
	public void search(String url) { //TestSearchable 에 대한 실체 메소드
		System.out.println(url + "을 검색합니다.");
	}
}
