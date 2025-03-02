package sec02.exam04;
//배열의 length 필드
public class practice {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		int sum = 0; //총합 넣어줄 변수
		for(int i=0; i<scores.length; i++) { // for 문의 조건식에서 < 연산자를 사용한 이유는 배열의 마지막 인덱스는 배열 길이보다 1이 적기 떄문입니다.
			sum += scores[i];                // 배열의 인덱스 범위는 0~(길이-1)인데, 만약 인덱스를 초과해서 사용하면 ArrayIndexOutOfBoundsException이 발생합니다.
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}
