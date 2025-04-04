//package sec01.exam06;
////인터페이스 사용
//public class TestMyClass {
//	//필드
//	TestRemoteControl rc = new TestTelevision(); // TestRemoteControl 타입 참조변수 rc 에 TestTelevision 객체를 할당 자동타입변환
//
//	//생성자
//	TestMyClass() { //기본 생성자
//	}
//
//	TestMyClass(TestRemoteControl rc) {
//		this.rc = rc;
//		rc.turnOn();
//		rc.setVolume(5);
//	}
//
//	//메소드
//	void methodA() {
//		TestRemoteControl rc = new TestAudio();
//		rc.turnOn();
//		rc.setVolume(5);
//	}
//
//	void methodB(TestRemoteControl rc) {
//		rc.turnOn();
//		rc.setVolume(5);
//	}
//}