package sec01.exam04;
//super 변수
public class TestSupersonicAirplane extends TestAirplane {
	public static final int NORMAL = 1; // 객체 생성안하고 사용 가능한 상수
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override	//재정의
	public void fly() {
		if(flyMode == SUPERSONIC) { //flayMode가 SUPERSONIC 상수값을 가지면 초음속비행합니다를 출력
			System.out.println("초음속비행합니다.");
		} else {
			super.fly(); //아니면 부모인 Airplane 의 fly() 메소드 호출
		}
	}
}