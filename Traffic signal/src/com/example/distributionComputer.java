package com.example;
//매개 변수의 개수를 모를 경우
public class distributionComputer {
	int sum1(int[] values) { //배열객체 생성하고 메소드 호출해야함
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) { //값만 넘겨주면 자동으로 배열이 생성되고 매개값으로 사용됨
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum +=values[i];
		}
		return sum;
	}
}
//sum1()과 sum2() 메소드의 실행문이 완전 일치하는 것을 볼 수 있씁니다. 매개 변수의 선언 방법만 다를 뿐이지 매개 변수의 타입이 배열이므로
//처리 내용이 같을 수밖에 없습니다.