package sec02.verify.exam02;

public class practice {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i <= 100; i++) {
			if(i%3==0) {
				sum +=i;
			}
		}
		System.out.println("3의 배수의합: " + sum);
	}
}
