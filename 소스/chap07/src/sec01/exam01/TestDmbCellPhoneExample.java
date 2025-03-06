package sec01.exam01;
//자식 클래스 사용
public class TestDmbCellPhoneExample {
	public static void main(String[] args) {
		//TestDmbCellPhone 객체 생성
		TestDmbCellPhone TestdmbCellPhone = new TestDmbCellPhone("자바폰", "검정", 10);
		
		//TestCellPhone 클래스로부터 상속받은 필드
		System.out.println("모델: " + TestdmbCellPhone.model);
		System.out.println("색상: " + TestdmbCellPhone.color);
		
		//TestDmbCellPhone 클래스의 필드
		System.out.println("채널: " + TestdmbCellPhone.channel);
		
		//TestCellPhone 클래스로부터 상속받은 메소드 호출
		TestdmbCellPhone.powerOn();
		TestdmbCellPhone.bell();
		TestdmbCellPhone.sendVoice("여보세요.");
		TestdmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		TestdmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		TestdmbCellPhone.hangUp();
		
		//TestDmbCellPhone 클래스의 메소드 호출
		TestdmbCellPhone.turnOndmb();
		TestdmbCellPhone.ChangeChannelDmb(12);
		TestdmbCellPhone.turnOffDmb();
	}
}
