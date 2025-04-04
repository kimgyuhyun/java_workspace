package chap09.src.sec01.exam06;

public class TestButtonExample {
    public static void main(String[] args) {
        TestButton btn = new TestButton();

        btn.setOnClickListener(new TestCallListener());
        btn.touch();

        btn.setOnClickListener(new TestMessageListener());
        btn.touch();
    }
}
