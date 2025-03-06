package sec01.exam03;
//메소드 재정의 테스트
public class TestComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		TestCalculator calculator = new TestCalculator();
		System.out.println("원면적: " + calculator.areaCircle(r));
		System.out.println();
		
		TestComputer computer = new TestComputer();
		System.out.println("원면적 : " + computer.areaCircle(r)); //재정의된 메소드 호출
	}
}