package sec04.verify.exam03;

public class TestMemberServiceExample {
	public static void main(String[] args) {
		 TestMemberService memberService = new TestMemberService(); // 객체 생성
		 boolean result = memberService.login("hong", "12345"); //메소드에 매개값 넣고 호출 리턴값을 result 변수에 저장
		 if(result) {
			 System.out.println("로그인 되었습니다.");
			 memberService.logout("hong");
		 } else {
			 System.out.println("id 또는 password가 올바르지 않습니다.");
		 }
	}
}
