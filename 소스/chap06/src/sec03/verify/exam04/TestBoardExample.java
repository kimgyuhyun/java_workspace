package sec03.verify.exam04;

public class TestBoardExample {
	public static void main(String[] args) {
		TestBoard board1 = new TestBoard("제목", "내용");
		TestBoard board2 = new TestBoard("제목", "내용", "홍길동");
		TestBoard board3 = new TestBoard("제목", "내용", "홍길동", "2025-2-28");
		TestBoard board4 = new TestBoard("제목", "내용", "홍길동", "2025-2-28", 0);
	}
}
