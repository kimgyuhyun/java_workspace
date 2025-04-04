package chap09.src.sec01.exam05;

public class TestOutter {
    String field = "TestOutter-field";
    void method() {
        System.out.println("TestOuter-method");
    }
    
    class Nested {
        String field = ("Nested-method");
        void method() {
            System.out.println("Nested-method");
        }
        void print() {
            System.out.println(this.field);
            this.method(); //중첩 객체 참조
            System.out.println(TestOutter.this.field);
            TestOutter.this.method(); //바깥 객체 참조
        }
    }
}
