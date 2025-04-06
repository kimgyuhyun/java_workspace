package chap09.src.sec02.exam02;

public class TestAnonymous {
	//필드 초기값으로 대입
	TestRemoteControl field = new TestRemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};

	void method1() {
		//로컬변수값으로 대입
		TestRemoteControl localVar = new TestRemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		//로컬변수 사용
		localVar.turnOn();
	}

	void method2(TestRemoteControl rc) {
		rc.turnOn();
	}
}

