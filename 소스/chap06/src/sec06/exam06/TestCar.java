package sec06.exam06;
//Getter 와 Setter 메소드 선언
public class TestCar {
	//필드
	private int speed; //private 접근 제한자 필드 스피드
	private boolean stop; //private 접근 제한자 필드 스톱
	
	//생성자
	
	//메소드
	public int getSpeed() { //Getter 메소드
		return speed;
	}
	public void setSpeed(int speed) { //Setter 메소드
		if(speed < 0) { 			  //0보다 작으면 = 음수면
			this.speed = 0; 		  //필드에 0을 넣고 리턴
			return;
		} else {
			this.speed = speed;       //아니면 매개값을 필드에 넣고 리턴
		}
	}
	
	public boolean isStop() { 		  //boolean 타입은 get 대신 is 로 시작하는것이 관례
		return stop;
	}
	public void setStop(boolean stop) { //Getter 메소드에 매개변수로 boolean 타입 stop 이 들어오면
		this.stop = stop;				// 매개값을 필드 stop 에 저장
		this.speed = 0;					// 0을 필드 speed 에 저장
	}
}
