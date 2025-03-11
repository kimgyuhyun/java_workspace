package sec02.exam05;
//호출 가능 메소드
public class TestExample {
	public static void main(String[] args) {
		TestImplementationC impl = new TestImplementationC(); //하위 인터페이스 구현 객체 생성
		
		TestInterfaceA ia = impl;
		ia.methodA();
		System.out.println(); //TestInterfaceA 변수는 metohdA()만 호출 가능
		
		TestInterfaceB ib = impl;
		ib.methodB();  //TestInterfaceB 변수는 methodB()만 호출 가능
		System.out.println();
		
		TestInterfaceC ic = impl;
		ic.methodA(); //InterfaceC 변수는 methodA(), methodB(), methodC() 모두 호출 가능
		ic.methodB();
		ic.methodC();
	}
}
