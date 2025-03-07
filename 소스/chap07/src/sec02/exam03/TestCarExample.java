package sec02.exam03;
//실행 클래스
public class TestCarExample {
	public static void main(String[] args) {
		TestCar car = new TestCar(); // TestCar 객체 생성
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run(); //TestCar 객체의 run() 메소드 5번 반복 실행			
			
			switch(problemLocation) {
				case 1:
					System.out.println("앞왼쪽 TestHankookTire로 교체"); //자동 타입 변환
					car.frontLeftTire = new TestHankookTire("앞왼쪽", 15); //앞왼쪽 타이어가 펑크 났을 때 TestHankookTIre로 교체
					break;
				case 2:
					System.out.println("앞오른쪽 TestKumhoTire로 교체"); //앞오른쪽 타이어가 펑크 났을 때 TestKumhoTire로 교체
					car.frontRightTire = new TestKumhoTire("앞오른쪽", 13);
					break;
				case 3:
					System.out.println("뒤왼쪽 TestHankookTire로 교체"); //뒤왼쪽 타이어가 펑크 났을 때 TestHankookTIre로 교체
					car.backLeftTire = new TestHankookTire("뒤왼쪽", 14);
					break;
				case 4:
					System.out.println("뒤오른쪽 TestKumhoTire로 교체"); //뒤오른쪽 타이어가 펑크 났을 때 TestKumhoTIre로 교체
					car.backRightTire = new TestKumhoTire("뒤오른쪽", 17);
					break;
			}
			System.out.println("---------------------"); //1회전 시 출력되는 내용을 구분
		}
	}
}
