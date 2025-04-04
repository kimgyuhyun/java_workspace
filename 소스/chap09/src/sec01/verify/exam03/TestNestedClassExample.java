package chap09.src.sec01.verify.exam03;

public class TestNestedClassExample {
    TestCar myCar = new TestCar();

    TestCar.TestTire tire = myCar.new TestTire();

    TestCar.TestEngine engine = new TestCar.TestEngine();
}