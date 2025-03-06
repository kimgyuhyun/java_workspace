package com.example;

public class DistributionSupersonicAirplaneExample {
	public static void main(String[] args) {
		DistributionSupersonicAirplane sa = new DistributionSupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = DistributionSupersonicAirplane.SUPERSONIC; // flyMode 필드에 TestSupersonic 클래스의 상수를 저장 정적멤버라 클래스.필드이름으로 접근해야함
		sa.fly();
		sa.flyMode = DistributionSupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}