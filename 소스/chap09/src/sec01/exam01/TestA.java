package chap09.src.sec01.exam01;

/** 바깥 클래스 **/
    class TestA {
        TestA() {System.out.println("TestA 객체가 생성됨");}

    /** 인스턴스 멤버 클래스 **/
    class TestB {
        TestB() {System.out.println("TestB 객체가 생성됨.");}
        int field1;
        // static int field2;
        void method1() {}
        // static void method2() { }
    }

    /** 정적 멤버 클래스 **/
    static class TestC {
        TestC() {System.out.println("TestC 객체가 생성됨.");}
        int field1;
        static int field2;
        void method1() { }
        static void method2() { }
    }

    void method() {
        //** 로컬 클래스 **/
        class TestD {
            TestD() {System.out.println("TestD 객체가 생성됨.");}
            int field1;
            // static int field2;
            void method1() { }
            // static void method2() { }
        }
        TestD d = new TestD();
        d.field1 = 3;
        d.method1();
    }
}
