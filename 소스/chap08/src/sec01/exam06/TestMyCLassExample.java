package sec01.exam06;
//인터페이스 사용
public class TestMyCLassExample {
	public static void main(String[] args) {
		System.out.println("1)----------------");
		
		TestMyClass myClass1 = new TestMyClass(); //객체생성
		myClass1.rc.turnOn(); //참조변수.객체참조한필드.메소드이름
		myClass1.rc.setVolume(5);
		
		System.out.println("2)----------------");
		
		TestMyClass myCLass2 = new TestMyClass(new TestAudio()); //생성자 매개값은 TestRemoteContro rc 로 되어있지만 자동타입되어 할당됨
		
		System.out.println("3)----------------");
		
		TestMyClass myClass3 = new TestMyClass(); //객체생성
		myClass3.methodA(); //참조변수.메소드이름 //메소드가 호출되면 RemoteControl rc = new Audio();로 객체 생성하게 해두고
							//rc.turnOn(); 등으로 메소드 호출을해놔서 매개값안줘도 예상결과가 출력됨
		System.out.println("4)----------------");
		
		TestMyClass myClass4 = new TestMyClass(); //객체생성
		myClass4.methodB(new TestTelevision()); //참조변수.메소드이름/매개값으로 객체를 직접할당
	}											//메소드에서 매개값만 RemoteControl rc 로 받겠다해서 객체를 직접 넣어줘야함
}
