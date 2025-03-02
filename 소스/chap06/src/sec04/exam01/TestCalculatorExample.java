package sec04.exam01;
//메소드 호출
public class TestCalculatorExample {
	public static void main(String[] args) {
		TestCalculator myCalc = new TestCalculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6); //참조변수.메소드(매개변수)
		System.out.println("result1:" + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x,  y); //byte 타입이여도 자동타입변환되서 오류안뜸
		System.out.println("result: " + result2);
		
		myCalc.powerOff();
	}
}
