package sec03.exam02;
//추상 메소드 재정의
public class TestCat extends TestAnimal {
		public TestCat() {
			this.kind = "포유류";
		}
		
		@Override
		public void sound() { //추상 메소드 정의
			System.out.println("야옹");
		}
}