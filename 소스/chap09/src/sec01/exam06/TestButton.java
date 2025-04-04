package chap09.src.sec01.exam06;

public class TestButton {
    OnClickListener listener; // 인터페이스 타입 필드

    void setOnClickListener(OnClickListener Listener) { // 매개 변수의 다형성
        this.listener = Listener;
    }
    
    void touch() {
        listener.onClick(); // 구현 객체의 onclick() 메소드 호출
    }

    static interface OnClickListener {
        void onClick();
    }
}
