package sec04.exam03;
//return 문
public class TestCar {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) { //< 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
		this.gas = gas;   
	}
	
	boolean isLeftGas() { //<리턴값이 boolean 인 메소드로 gas 필드값이 0이면 false 를, 0이 아니면 true 를 리턴
		if(gas == 0) { // 필드에 무슨값이 들어올지 모르니 ==0으로 해두고 false로 리턴해둠
			System.out.println("gas가 없습니다.");
			return false; //false 를 리턴
		}
		System.out.println("gas가 있습니다.");
		return true; //true 를 리턴
	}
	
	void run() {         //<리턴값이 없는 메소드로 gas 필드값이 0이면 return 문으로 메소드를 강제 종료
		while(true) {
			if(gas > 0) {  //gas 가 0보다 크면
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1; // 1씩뺌
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return; //메소드 실행 종료
			}
		}
	}
}
