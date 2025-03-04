package com.example;

public class DistributionShopServiceExample {
	public static void main(String[] args) {
		DistributionShopService obj1 = DistributionShopService.getInstance();
		DistributionShopService obj2 = DistributionShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 DistributionShopServiceExample 객체입니다.");
		} else {
			System.out.println("다른 DistributionShopServiceExample 객체입니다.");
		}
	}
}