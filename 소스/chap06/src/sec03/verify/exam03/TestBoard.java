package sec03.verify.exam03;

public class TestBoard {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	TestBoard(String title, String content) {
		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0); //매개변수값이 title 과 content 에 들어왔으니 변수값은 
	}																 // 필드에 주고 매게변수값 안들어온 나머지 필드는 생성자에서 초기화값 할당
	
	TestBoard(String title, String content, String writer) {
		this(title, content, writer, "현재 컴퓨터 날짜", 0);
	}
	
	TestBoard(String title, String content, String writer, String date) {
		this(title, content, writer, date, 0);
	}
	
	TestBoard(String title, String content, String writer, String date, int hitcount) { //1,2,3번 생성자가 마지막 생성자를 호출
		this.title = title;                					//여기서만 생성자 오버로딩
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
}
