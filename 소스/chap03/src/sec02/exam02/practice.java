package sec02.exam02;

public class practice {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------------");
		x++;  // 후위 증가 연산자 사용 x 값을 사용한 후 1증가 = 11
		++x;  // 전위 증가 연산자 사용 먼저 x 값을 1 증가후 사용 = 12
		System.out.println("x=" + x);
		
		System.out.println("-------------------");
		y--; // 후위 감소 연산자 사용 y 값을 사용한후 1감소 = 9
		--y; // 전위 감소 연산자 사용 먼저 y 값을 1 감소후 사용 = 8
		System.out.println("y=" + y);
		
		System.out.println("-------------------");
		z = x++; // 후위 증가 연산자 사용
		System.out.println("z=" + z); // 12으로 출력후 1 증가
		System.out.println("x=" + x); // 13을 출력
		
		System.out.println("-------------------");
		z = ++x; // 전위 증가 연산자 사용
		System.out.println("z=" + z); // 14로 먼저 증가한후 출력
		System.out.println("x=" + x); // 그대로 14로 출력
		
		System.out.println("-------------------");
		z = ++x + y++;
		System.out.println("z=" + z); //x = 14 전위 증가 연산자 사용으로 x = 15, y = 8 후위 증가 연산자 사용으로 15+8 계산을 마친뒤 증가해서 y=9
		System.out.println("x=" + x); //15
		System.out.println("y=" + y); //9
	}
}
