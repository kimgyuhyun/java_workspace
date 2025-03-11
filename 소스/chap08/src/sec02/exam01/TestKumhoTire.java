package sec02.exam01;
//구현 클래스
public class TestKumhoTire implements TestTire {
	@Override //메소드 재정의
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다."); //TestTire 객체 구현
	}
}
