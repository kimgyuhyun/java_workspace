package sec01.exam03;
//자식 클래스
public class TestComputer extends TestCalculator {
	@Override //재정의
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}