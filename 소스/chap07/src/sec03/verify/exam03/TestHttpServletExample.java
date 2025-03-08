package sec03.verify.exam03;

public class TestHttpServletExample {
	public static void main(String[] args) {
		method(new TestLoginServlet()); //로그인합니다.
		method(new TestFileDownloadServlet()); //파일 다운로드합니다.
	}
	
	public static void method(TestHttpServlet servlet) {
		servlet.service();
	}
}

//method(new TestLoginServlet()); 
//public static void method(TestHttpServlet servlet)는
//TestHttpServlet servlet = new TestLoginServley()과 같음