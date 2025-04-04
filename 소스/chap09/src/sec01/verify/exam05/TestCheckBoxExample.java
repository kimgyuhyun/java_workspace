package chap09.src.sec01.verify.exam05;

public class TestCheckBoxExample {
    public static void main(String[] args) {
        TestCheckBox checkBox = new TestCheckBox();
        checkBox.setOnSelectListener(new TestBackgroundChangeListener());
        checkBox.select();
    }
}
