package sec02.verify.exam07;

import java.util.Scanner;
public class practice {
	public static void main(String[] args) {
		boolean run = true; //프로그램이 계속 실행되는지 결정하는 변수
		int balance = 0; // 계좌잔액 초기값은 0
		Scanner scanner = new Scanner(System.in); // 사용자 입력을 받는 객체
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> "); 
			
		int menuNum = Integer.parseInt(scanner.nextLine()); // 1, 2, 3, 4번 메뉴중 하나를 입력받고 int 타입으로 변환후 menuNUm변수에 넣어줌
		
		switch (menuNum) { 
//		switch 문은 if 문처럼 조건식이 true 일 경우에 블록 내부의 실행문을 실행하는게 아니라 변수가 어떤 값을 갖느냐에 따라 실행문이 결정
//		if 문은 조건식의 결과가 true, false 두 가지밖에 없기 떄문에 경우의 수가 많아질 수록 else-if문을 반복적으로 추가해야 하므로 코드가 복잡해지지만
//		switch 문은 변수의 값에 따라서 실행문이 결정되기 때문에 같은 기능의 if 문보다 코드가 간결함
		case 1:
			System.out.print("예금액> "); //출력
			balance += Integer.parseInt(scanner.nextLine()); //받고 balance 변수에 +하여 저장
			break;
		case 2:
			System.out.print("출금액>" ); //출력
			balance -= Integer.parseInt(scanner.nextLine()); //받고 balance 변수에 -하여 저장
			break;
		case 3:
			System.out.print("잔고> "); //출력
			System.out.println(balance); //balance 변수를 출력
			break;
		case 4:
			run = false; // boolean 타입 run 변수에 false 를 저장하여 루프를 빠져나오게함
			break;
		}
		System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}

//int menuNum = Integer.parseInt(scanner.nextLine());
//
//switch (menuNum) {
//case 1:
//	System.out.print("예금액> ");
//	balance += Integer.parseInt(scanner.nextLine());
//	break;
//case 2:
//	System.out.print("출금액> ");
//	balance -= Integer.parseInt(scanner.nextLine());
//	break;
//case 3:
//	System.out.print("잔고> ");
//	System.out.println(balance);
//	break;
//case 4:
//	run = false;
//	break;
//}
//
//System.out.println();
//}
//
//System.out.println("프로그램 종료");