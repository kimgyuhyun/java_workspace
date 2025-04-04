package sec04.exam02;
//매개 변수의 개수를 모를 경우
public class TestComputerExample {
	public static void main(String[] args) {
		TestComputer myCom = new TestComputer(); //TestComputer 객체생성해서 번지를 TestComputer타입 mycom 에 참조
		
		int[] values1 = {1, 2, 3,}; //int 타입 배열객체생성 후 values1에 참조
		int result1 = myCom.sum1(values1); // 참조변수 values1을 sum1 메소드의 매개변수로 사용
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5}); //배열객체를 생성후 메소드의 매개변수로 직접 전달
		System.out.println("result2: " + result2);
		
		int result3 = myCom.sum2(1, 2, 3); //sum2 매소드는 ...를 사용해서 선언했기 떄문에 값만 넘겨주면 자동으로 배열이 생성되고 매개값으로 사용됨
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);
	}
}
