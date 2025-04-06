package chap09.src.sec02.exam03;


public class TestWindow {
    TestButton button1 = new TestButton();
    TestButton button2 = new TestButton();

    //필드 초기값으로 대입
    TestButton.OnClickListener Listener = new TestButton.OnClickListener() { // 필드값으로 익명 객체 대입
        @Override
        public void onClick() {
            System.out.println("전화를 겁니다.");
        }
    };

    TestWindow() {
        button1.setOnClickListener(Listener);
        button2.setOnClickListener(new TestButton.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("메시지를 보냅니다.");
            }
        });
    }
}
