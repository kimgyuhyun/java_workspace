package sec02.verify.exam06;

public class practice {
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int b=1; b<=4-i; b++) {
			System.out.print(" ");	
			}
			for(int j=1; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
