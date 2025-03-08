package sec03.exam01;
//실행 클래스
public class TestPhoneExample {
	public static void main(String[] args) {
		//TestPhone phone = new TestPhone();
		
		TestSmartPhone smartPhone = new TestSmartPhone("홍길동");
		
		smartPhone.turnOn(); //Phone 의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff(); //Phone 의 메소드
	}
}