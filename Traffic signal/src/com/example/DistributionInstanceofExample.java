package com.example;
//객체 타입 확인
public class DistributionInstanceofExample {
	public static void method1(DistributionParent parent) { //클래스타입 매개변수 객체를 다룰때 많이 사용함
		if(parent instanceof DistributionChild) { //매개변수 parent 가 어느 객체를 참조하고있는지 확인하고 TestChild 면 자동타입변환된 상태니 true
			DistributionChild child = (DistributionChild) parent; //조건식이 true 면 TestChild로 강제타입변환
			System.out.println("method1 - TestChild로 변환 성공");
		} else {
			System.out.println("method1 - TestChild로 변환되지 않음");
		}
	}
	
	public static void method2(DistributionParent parent) {
		DistributionChild child = (DistributionChild) parent; //객체 타입 확인을 안해서 classCastException이 발생할 가능성이 있음
		System.out.println("method2 - TestChild로 변환 성공");
	}
	
	public static void main(String[] args) {
		DistributionParent parentA = new DistributionChild(); //TestChild 객체를 TestParent 타입으로 참조
		method1(parentA); //TestChild 객체를 매개값으로 전달 매개값인 parentA가 TestChild 객체를 참조하고있으니 조건식이 true 가 되어 변환 성공 출력
		method2(parentA); //TestChild 객체를 매개값으로 전달 매개값인 parentA가 TestChild 객체를 참조하고있으니 변환 성공 출력
		
		DistributionParent parentB = new DistributionParent(); //TestParent 객체 생성
		method1(parentB);  //TestParent 객체를 매개값으로 전달 조건식이 false 라 변환되지 않음이 출력
//		method2(parentB); // 객체 타입 확인 연산자로 검증을 안하고 TestParent를 TestChild로 강제 변환 시도 -> ClassCastException 발생
	}
}