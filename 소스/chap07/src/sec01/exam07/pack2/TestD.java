package sec01.exam07.pack2;
import sec01.exam07.pack1.TestA;
//protected 접근 제한자
public class TestD extends TestA{
	public TestD() {
		super(); //접근 가능
		this.field = "value"; //접근 가능
		this.method(); //접근 가능
	}
}