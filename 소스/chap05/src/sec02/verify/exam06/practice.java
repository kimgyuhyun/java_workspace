//package sec02.verify.exam06;
//
//import java.util.Scanner;
//
//public class practice {
//	public static void main(String[] args) {
//		boolean run = true; //run 변수를 true 로 설정하여 종료조건을 만족할때까지 while 루프를 반복하도록함
//		int studentNum = 0; //학생수를 저장하는 변수
//		int[] scores = null;//학생들의 점수를 저장할려는 배열변수를 선언해둠 점수가 입력되면 배열객체를 생성함
//		Scanner scanner = new Scanner(System.in); //입력값을 받을수 있는 스캐너 객체 생성하고 스캐너 변수에 저장
//
//		while(run) { //run 변수가 true 일 동안 반복문이 실행 즉, 프로그램이 종료될때까지 계속해서 메뉴를 보여주고 사용자의 선택을 받음
//			System.out.println("-----------------------");
//			System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5종료");
//			System.out.println("-----------------------");
//			System.out.print("선택> ");
//
//			int selectNo = Integer.parseInt(scanner.nextLine());//사용자가 입력한 선택값을 String 값으로 받으므로 메소드를 이용하여 정수로 변환 후 selectNo에 저장
//
//			if(selectNo == 1) {
//				System.out.print("학생수> ");
//				studentNum = Integer.parseInt(scanner.nextLine());//학생수를 입력받고 studentNum에 저장
//				scores = new int[studentNum];					  //scores 배열을 학생수만큼 크기를 설정하여 생성
//			} else if(selectNo == 2) {
//				for(int i=0; i<scores.length; i++) { // scores 배열에 각 인덱스를 순차적으로 반복
//					System.out.print("scores[" + i + "]> ");
//					scores[i] = Integer.parseInt(scanner.nextLine());//scores 배열에 인덱스에 학생수만큼 반복하면서 점수를 하나씩 입력받고, 배열에 저장
//				}
//			} else if(selectNo == 3) {
//				for(int i=0; i<scores.length; i++) {
//					System.out.println("scores[" + i + "]" + scores[i]); //scores 배열에 저장된 모든 정수를 출력
//				}
//			} else if(selectNo == 4) {
//				int max = 0; //최고점수를 저장할 변수
//				int sum = 0; //점수의 합을 저장할 변수
//				double avg = 0.0; //평균점수를 저장할 변수
//
//				for(int i=0; i<scores.length; i++) { // scores 배열에 각 인덱스를 순차적으로 반복
//					max = (max< scores[i]) ? scores[i] : max; // max 보다 scores[i]가 더 크면 max 값을 scores[i]로 업데이트 false 면 max 값은 그대로
//					//삼항 연산자 조건식: max < scores[i], 조건식이 true 일떼 실행되는 값 scores[i] 조건식이 false 일때 실행되는 값 max;
//					sum += scores[i]; //점수의 합을 저장
//				}
//				avg = (double) sum / studentNum; //전체값을 학생수로 나누고 결과를 avg에 저장
//				System.out.println("최고 점수: " + max);
//				System.out.println("평균 점수: " + avg);
//			} else if(selectNo == 5) {
//				run = false; //run 변수에 false 가 저장되어 루프가 종료
//			}
//		}
//
//		System.out.println("프로그램 종료");
//	}
//}
//
