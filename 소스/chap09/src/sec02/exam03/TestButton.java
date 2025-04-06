package chap09.src.sec02.exam03;

public class TestButton {
    OnClickListener listener; //인터페이스 타입 필드

    void setOnClickListener(OnClickListener listener) { // 매개 변수의 다형성
        this.listener = listener; 
    }

    void touch() {
        listener.onClick(); // 구현 객체의 onClick() 메소드 호출
    }

    static interface OnClickListener {
        void onClick();
    }
}
