package sec04.verify.exam03;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String ssr = scanner.nextLine();
		
		System.out.print("3. 전화번호: ");
		String tel = scanner.nextLine();
		
		System.out.println();
		
		System.out.println("[입력된 내용]");
		System.out.println("이름: " + name);
		System.out.println("주민번호 앞 6자리: " + ssr);
		System.out.print("전화번호: " + tel);

	}
}