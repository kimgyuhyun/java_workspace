package sec01.exam05;

public class practice {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) +1;
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
		default:
			System.out.println("6번이 나왔습니다.");
			break; //break이 붙어있는 이유는 다음 cse를 실행하지 않고 switch문을 빠져나가기 위해서 break이 없으면 다음 case가 연달아 실행되는데, 이때 case 값과는 상관없이 실행됨
		}
	}
}
