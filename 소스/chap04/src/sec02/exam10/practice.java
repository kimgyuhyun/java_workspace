package sec02.exam10;
//continue를 사용한 for문
public class practice {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0 ) { //i를 2로 나눠서 나머지가 0이 아닐 경우, 즉 홀수인 경우
				continue;
			}
			System.out.println(i);
		}
	}
}
