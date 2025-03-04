package sec05.exam02;
//정적 멤버 사용
public class TestCalculatorExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * TestCalculator.pi; 
		int result2 = TestCalculator.plus(10, 5); //클래스 이름으로 호출
		int result3 = TestCalculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}
