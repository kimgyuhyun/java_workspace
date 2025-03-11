package com.example;
//호출 가능 메소드
public class DisExample {
	public static void main(String[] args) {
		DisImplementationC impl = new DisImplementationC(); //하위 인터페이스 구현 객체 생성
		
		DisInterfaceA ia = impl;
		ia.methodA();
		System.out.println(); //TestInterfaceA 변수는 metohdA()만 호출 가능
		
		DisInterfaceB ib = impl;
		ib.methodB();  //TestInterfaceB 변수는 methodB()만 호출 가능
		System.out.println();
		
		DisInterfaceC ic = impl;
		ic.methodA(); //InterfaceC 변수는 methodA(), methodB(), methodC() 모두 호출 가능
		ic.methodB();
		ic.methodC();
	}
}
