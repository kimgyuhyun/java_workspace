package sec01.exam06;

public class practice {
	public static void main(String[] args) {
		int time = (int) (Math.random() *4) + 8; //8<= ... <=11 사이의 정수 뽑기 0부터 3까지의 정수만 뽑는랜덤함수에 +8을 해서 8부터 11까지의 정수뽑기로 변경
		System.out.println("[현재시간: " + time + " 시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
	}
}
