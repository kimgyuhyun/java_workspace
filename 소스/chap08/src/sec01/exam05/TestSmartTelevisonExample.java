package sec01.exam05;
//인터페이스 변수에 구현 객체 대입
public class TestSmartTelevisonExample {
	public static void main(String[] args) {
		TestSmartTelevision tv = new TestSmartTelevision(); //객체 생성
		
		TestRemoteControl rc = tv; //TestSmartTelevision 객체를 TestRemoteControl과 TestSearchable 타입 변수에 각각 대입 가능
		TestSearchable searchable = tv;
	}
}
