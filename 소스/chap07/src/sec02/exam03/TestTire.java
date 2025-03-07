package sec02.exam03;
//Tire 클래스
public class TestTire {
	//필드
	public int maxRotation; //최대 회전수(타이어 수명)
	public int accumulatedRotation; //누적 회전수
	public String location; // 타이어의 위치
	
	//생성자
	public TestTire(String location, int maxRotation) {
		this.location = location; //타이어의 위치 초기화
		this.maxRotation = maxRotation; //최대 회전수 초기화
	}
	
	//메소드
	public boolean roll() { 
		++accumulatedRotation; //누적 회전수 1증가
		if(accumulatedRotation<maxRotation) { //정상 회전(누적<최대>일 경우 실행
			System.out.println(location + " TestTire 수명: " + (maxRotation-accumulatedRotation) + "회"); 
			return true;
		} else {
			System.out.println("*** " + location + " TestTire 펑크 ***"); //펑크(누적=최대)일 경우 실행
			return false;
		}
	}
}
