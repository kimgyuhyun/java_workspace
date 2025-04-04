package chap09.src.sec01.exam01;

public class TestMain {
    public static void main(String[] args) {
        TestA a = new TestA();

        // 인스턴스 멤버 클래스 객체 생성
        TestA.TestB b = a.new TestB();
        b.field1 = 3;
        b.method1();
        
        //정적 멤버 클래스 객체 생성
        TestA.TestC c = new TestA.TestC();
        c.field1 = 3;
        c.method1();
        TestA.TestC.field2 = 3;
        TestA.TestC.method2();

        // 로컬 클래스 객체 생성을 위한 메소드 호출
        a.method();
    }
}
