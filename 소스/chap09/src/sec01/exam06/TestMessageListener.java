package chap09.src.sec01.exam06;

public class TestMessageListener implements TestButton.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("메시지를 보냅니다.");
    }
}
