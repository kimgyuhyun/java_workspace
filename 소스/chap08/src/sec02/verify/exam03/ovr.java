package chap08.src.sec02.verify.exam03;

public class ovr {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;  // 변수 a, b, c, d를 각각 1, 2, 3, 4로 초기화
        int mx, mn;  // 변수 mx와 mn을 선언

        mx = a < b ? b : a;  // 조건 연산자(삼항 연산자)를 사용하여 mx에 값 할당
        // a < b가 true이므로, b(2)가 mx에 할당된다.
        // mx = 2가 됨

        if (mx == 1) {  // mx 값이 1인지 확인. 여기서는 mx가 2이므로 조건이 false
            mn = a > mx ? b : a;  // 이 조건문은 실행되지 않음
        }
        else {  // 위의 조건문이 거짓일 때 실행
            mn = b < mx ? d : c;  // b < mx (2 < 2)가 false이므로 c(3)이 mn에 할당된다.
        }

        System.out.println(mn);  // mn의 값을 출력, mn은 3이므로 3이 출력된다.
    }
}

