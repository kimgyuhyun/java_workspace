package sec02.exam04;

public class Starptest {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int b=1; b<=5 -i;  b++) {
				System.out.print(" ");
			}
			for (int j=1; j<= i*2 -1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
