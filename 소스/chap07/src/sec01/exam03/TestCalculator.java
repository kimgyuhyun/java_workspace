package sec01.exam03;
//부모 클래스
public class TestCalculator {
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r; //정밀한 계산을 위해 수정
	}
}
