package chap09.src.sec01.verify.exam05;

public class TestBackgroundChangeListener implements TestCheckBox.OnSelectListener {
    @Override
    public void onSelect() {
        System.out.println("배경을 변경합니다.");
    }
}
