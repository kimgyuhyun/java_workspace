package sec04.exam05;

import java.util.Scanner; //Scanner가 java.util 패키지에 있다는 것을 컴파일러에게 알려주는 역할

public class practice {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in); //Scanner 타입의 변수 scanner를 선언 후 시스템의 입력장치로부터 읽는 Scanner를 생성
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine(); //String 변수에 scanner.nextLine() 메소드를 실행
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q")) { // innputData에 저장된 문자열이 q일 경우 중괄호 내부가 실행
				break;
			}
		}
		
		System.out.println("종료");
	}
}

	// QstopExample.java의 10라인와 ScannerExample.java의 13라인에서 q가 입력되었는지 검사하는 코드가 다른 이유는
	// Qstop에서는 System.in.read()로 읽었기 때문에 int 타입의 키코드를 얻었고 Scanner에서는 scanner.nextLine()으로 읽었기 때문에 String 타입에 문자열을 얻음
	// 자바는 기본타 타입의 값이 동일한지 비교할 때에는 ==를 사용하고, 문자열(String)이 동일한지 비교할 때에는 equals()메소드를 사용하기때문.