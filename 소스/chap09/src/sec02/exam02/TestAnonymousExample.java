package chap09.src.sec02.exam02;


public class TestAnonymousExample {
    public static void main(String[] args) {
        TestAnonymous anony = new TestAnonymous();
        // 익명 객체 필드 사용
        anony.field.turnOn();
        //익명 객체 로컬 변수 사용
        anony.method1();
        // 익명 객체 매개값 사용
        anony.method2(
                new TestRemoteControl() {
                    @Override
                    public void turnOn() {
                        System.out.println("SmartTv를 켭니다.");
                    }
                    @Override
                    public void turnOff() {
                        System.out.println("SmartTv를 끕니다.");
                    }
                }
        );
    }
}
