package sec02.exam02;
//값 목록으로 배열 생성
public class practice {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		//배열의 합을 계산하여 출력하는 코드
		int sum2 = add( new int[] {83, 90, 87} ); //add 메소드에 배열변수를 매개변수로 넣음
		System.out.println("총합 : " + sum2);
		System.out.println();
	}
	// 배열의 합을 계산하는 add 메소드 정의
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {					// < 총합을 계산해서 리턴하는 메소드
			sum += scores[i];
		}
		return sum;
	}
}
