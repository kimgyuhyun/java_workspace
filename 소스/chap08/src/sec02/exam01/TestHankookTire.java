package sec02.exam01;
//구현 클래스
public class TestHankookTire implements TestTire {
	@Override //메소드 재정의
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다."); //TestTire 인터페이스 구현
	}
}
