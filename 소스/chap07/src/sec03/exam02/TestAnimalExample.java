package sec03.exam02;
//실행 클래스
public class TestAnimalExample {
	public static void main(String[] args) {
		TestDog dog = new TestDog(); //TestDog 객체 생성
		TestCat cat = new TestCat(); //TestCat 객체 생성
		dog.sound(); //sound 메소드 호출
		cat.sound(); //sound 메소드 호출
		System.out.println("------");
		
		//변수의 자동 타입 변환
		TestAnimal animal = null; //TestAnmial 객체 생성
		animal = new TestDog(); //자동 타입 변환 및 재정의된 메소드 호출
		animal.sound();			
		animal = new TestCat(); // //자동 타입 변환 및 재정의된 메소드 호출
		animal.sound();
		System.out.println("------");
		
		//메소드의 다형성
		animalSound(new TestDog()); //
		animalSound(new TestCat());
	} 
	
	public static void animalSound(TestAnimal animal) {
		animal.sound();
	}
}
