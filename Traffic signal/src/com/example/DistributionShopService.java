package com.example;

public class DistributionShopService {
	private static DistributionShopService singleton = new DistributionShopService(); //접근 제한자와 정적멤버 선언 클래스 참조변수 = 객체생성
	
	private DistributionShopService() {} //private 를 붙여 외부에서 생성자 호출을 못하게함
	
	static DistributionShopService getInstance() {
		return singleton;
	}
}
