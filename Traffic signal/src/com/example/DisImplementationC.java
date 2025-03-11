package com.example;
//하위 인터페이스 구현
public class DisImplementationC implements DisInterfaceC {
	public void methodA() { //DisInterfaceA와 TestInterfaceB의 실체 메소드도 있어야함
		System.out.println("DisImplementationC-methodA() 실행");
	}
	
	public void methodB() { //DisInterfaceA와 TestInterfaceB의 실체 메소드도 있어야함
		System.out.println("DisImplementationC-methodB() 실행");
	}
	
	public void methodC() {
		System.out.println("DisImplementationC-methodC() 실행");
	}
}
