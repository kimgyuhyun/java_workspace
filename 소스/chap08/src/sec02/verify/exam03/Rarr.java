package chap08.src.sec02.verify.exam03;

public class Rarr { // 'Rarr'라는 이름의 클래스 정의
    // 'marr'라는 정수형 배열을 반환하는 static 메소드 정의
    static int[] marr() {
        int temp[] = new int[4]; // 정수형 배열 'temp'를 길이가 4인 배열로 초기화
        for (int i = 0; i < temp.length; i++) // 배열 'temp'의 각 인덱스를 순차적으로 접근
            temp[i] = i; // 배열 'temp'의 각 인덱스에 인덱스 값 'i'를 대입 (즉, temp[0] = 0, temp[1] = 1, ...)
        return temp; // 배열 'temp'를 반환
    }

    public static void main(String[] args) { // main 메소드 시작: 프로그램의 실행이 시작되는 지점
        int iarr[]; // 정수형 배열 'iarr' 선언
        iarr = marr(); // 'marr' 메소드를 호출하여 배열을 반환받고, 'iarr'에 저장
        for (int i = 0; i < iarr.length; i++) // 배열 'iarr'의 각 인덱스를 순차적으로 접근
            System.out.println(iarr[i] + " "); // 배열 'iarr'의 각 원소를 출력 (각 원소 뒤에 공백 추가)
    }
}