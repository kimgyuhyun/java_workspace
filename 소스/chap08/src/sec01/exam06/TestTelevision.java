//package sec01.exam06;
//
//public class TestTelevision implements TestRemoteControl {
//	//필드
//	private int volume;
//
//	//turnOn() 추상 메소드의 실체 메소드
//	public void turnOn() {
//		System.out.println("TV를 켭니다.");
//	}
//	//turnOff() 추상 메소드의 실체 메소드
//	public void turnOff() {
//		System.out.println("TV를 끕니다.");
//	}
//	//setVolume() 추상 메소드의 실체 메소드
//	public void setVolume(int volume) {
//		if(volume>TestRemoteControl.MAX_VOLUME) {
//			this.volume = TestRemoteControl.MAX_VOLUME;
//		} else if(volume<TestRemoteControl.MIN_VOLUME) {
//			this.volume = TestRemoteControl.MIN_VOLUME;
//		} else {
//			this.volume = volume;
//		}
//		System.out.println("현재 TV 볼륨: " + this.volume);
//	}
//}