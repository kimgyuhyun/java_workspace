package chap09.src.sec01.exam06;

public class TestCallListener implements TestButton.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
