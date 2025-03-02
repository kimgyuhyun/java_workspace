package sec02.exam04;

public class triangle {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int b=1; b<=5-i; b++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int t=1; t<=4; t++) {
			for (int d=1; d<=t; d++) {
				System.out.print(" ");
			}
			for (int f=1; f<=9 -2*t; f++) {
				System.out.print("*");
		}
				System.out.println();
		}		

	}
}
