package chap09.src.sec01.exam05;

public class TestOutterExample {
    public static void main(String[] args) {
        TestOutter outter = new TestOutter();
        TestOutter.Nested nested = outter.new Nested();
        nested.print();
    }
}
