package sec05.verify.exam01;

public class TestShopServiceExample {
	public static void main(String[] args) {
		TestShopService obj1 = TestShopService.getInstance();
		TestShopService obj2 = TestShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 TestShopSerivce 객체입니다.");
		} else {
			System.out.println("다른 TestShopService 객체입니다.");
		}
	}
}
