package sec02.verify.exam09;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번쨰 수: ");
		double num1 = Double.parseDouble(scanner.nextLine());
		
		System.out.print("두 번째 수: ");
		double num2 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("---------------------");
		if(num2 != 0.0) { //!= 같지않다를 의미하는 부등호 연산자 num2값이 0.0와 같지않으면 true 같으면 false를 반환
			System.out.println("결과:" + (num1/num2)); 
		} else {
			System.out.println("결과: 무한대");
		}
	}
}
//Scanner scanner = new Scanner(System.in);
//
//System.out.print("첫 번째 수: ");
//double num1 = Double.parseDouble(scanner.nextLine());
//
//System.out.print("두 번째 수: ");
//double num2 = Double.parseDouble(scanner.nextLine());
//
//System.out.println("---------------------");
//if(num2 != 0.0) {
//	System.out.println("결과: " + (num1/num2));
//} else {
//	System.out.println("결과: 무한대");