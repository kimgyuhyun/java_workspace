package sec01.verify.exam03;

public class TestSoundableExample {
	private static void printSound(TestSoundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new TestCat());
		printSound(new TestDog());
	}
}
