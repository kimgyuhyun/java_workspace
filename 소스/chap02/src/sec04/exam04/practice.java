package sec04.exam04;

public class practice {
	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {	//keyCode가 113일 경우 while 반복을 중지함
				break;  
			}
		}
		
		System.out.println("종료");
	}
}
