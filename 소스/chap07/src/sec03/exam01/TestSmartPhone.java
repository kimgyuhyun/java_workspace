package sec03.exam01;
//실체 클래스
public class TestSmartPhone extends TestPhone {
	//생성자
	public TestSmartPhone(String owner) {
		super(owner); //메소드 호출할때 매개값으로 owner 값이 들어오면 추상 클래스에 생성자로 값을 넘겨서 호출
	}
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
