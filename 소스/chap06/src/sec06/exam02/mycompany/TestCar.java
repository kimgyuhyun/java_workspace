package sec06.exam02.mycompany;

import sec06.exam02.hankook.*;
import sec06.exam02.kumho.*;
import sec06.exam02.hyndai.Engine;  //사용된 클래스를 조사해서 필요한 import 문을 자동으로 추가하는 기능: Ctrl+Shift+O

public class TestCar {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
}