package sec01.exam04;
//인터페이스 변수에 구현 객체 대입
public class TestRemoteControleExample {
	public static void main(String[] args) {
		TestRemoteControl rc; // 인터페이스 변수
		rc = new TestTelevision(); //구현 객체 대입
		rc = new TestAudio(); //구현 객체 도입
	}
}