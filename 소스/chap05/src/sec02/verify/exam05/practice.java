//package sec02.verify.exam05;
//
//public class practice {
//	public static void main(String[] args) {
//		int[][] array = {  //다차원 배열 선언 3개의 행을 가지고 열 길이는 각 각 다름
//				{95, 86},
//				{83, 92, 96},
//				{78, 83, 93, 87, 88}
//		};
//
//		int sum = 0; //배열의 모든 값을 더 할 변수
//		double avg = 0.0; //평균값을 계산할 변수
//
//		int count = 0; //배열의 항목 개수를 셀 변수
//		for(int i=0; i<array.length; i++) { //i 는 행을 순차적으로 접근
//			for(int j=0; j<array[i].length; j++) { // j 는 열을 순차적으로 접근 array[i].length 는 각 행의 열의 개수 (인덱스와 항목 모두 0부터 시작함)
//				sum += array[i][j]; // 행번호와 열의 인덱스 번호를 순차적으로 전체값에 더함
//				count ++;  			//배열의 각 항목을 하나씩 처리할때마다 count 를 증가시켜서 항목 개수를 셈
//			}
//		}
//		avg = (double) sum / count; //배열 항목값들 / 항목 개수
//
//		System.out.println("sum: " + sum);
//		System.out.println("avg: " + avg);
//	}
//}
