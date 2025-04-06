package chap09.src.sec02.exam01;

public class TestAnonymousExample {
    public static void main(String[] args) {
        TestAnonymous anony = new TestAnonymous();
        //익명 객체 필드 사용
        anony.field.wake();
        //익명 객체 로컬변수 사용
        anony.method1();
        //익명 객체 매개값 사용
        anony.method2(
                new TestPerson() {
                    void study() {
                        System.out.println("공부합니다.");
                    }
                    @Override
                    void wake() {
                        System.out.println("8시에 일어납니다.");
                        study();
                    }
                }
        );
    }
}
