//package sec02.exam06;
////배열 속의 베열
//public class practice {
//	public static void main(String[] args) {
//
//		int[][] mathScores = new int[2][3]; //힙 영역에 배열객체 3개 생성
//		for(int i=0; i<mathScores.length; i++) { // 행의 길이 = 2 즉 i 는 0과 1이고 i 는 배열의 각 행을 참조함
//			for(int k=0; k<mathScores[i].length; k++) { //  mathScores[i]는 3이므로 k 는 0,1,2의 값을 가짐 즉 각 행의 열을 순차적으로 참조
//				System.out.println("mathScores["+i+"]["+k+"]="
//									+mathScores[i][k]);
//			}
//		}
//		System.out.println();
//
//		int[][] englishScores = new int[2][];
//		englishScores[0] = new int[2];
//		englishScores[1] = new int[3];
//		for(int i=0; i<englishScores.length; i++) {
//			for(int k=0; k<englishScores[i].length; k++) { // englishScores[0]은 2 [1]은 3이므로 0번째 행은 2개의열 1번째행은 3개의 열을 순차적으로 참조
//				System.out.println("englishScores["+i+"]["+k+"]="
//									+englishScores[i][k]);
//			}
//		}
//		System.out.println();
//
//		int[][] javaScores = { {95,80}, {92, 96, 80} };
//		for(int i=0; i<javaScores.length; i++) {
//			for(int k=0; k<javaScores[i].length; k++) {
//				System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]);
//			}
//		}
//
//	}
//}
