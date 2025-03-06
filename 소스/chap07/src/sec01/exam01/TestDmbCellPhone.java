package sec01.exam01;
//자식 클래스
public class TestDmbCellPhone extends TestCellPhone {
	//필드
	int channel;
	
	//생성자
	TestDmbCellPhone(String model, String color, int channel) {
		this.model = model; // TestCellphone 클래스로부터 상속받은 필드 
		this.color = color; // TestCellphone 클래스로부터 상속받은 필드 
		this.channel = channel;
	}
	
	//메소드
	void turnOndmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다");
	}
	void ChangeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
