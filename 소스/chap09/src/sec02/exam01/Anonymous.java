package chap09.src.sec02.exam01;

public class Anonymous {
	TestPerson field = new TestPerson() {
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};

	void method1() {
		TestPerson localVar = new TestPerson() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVar.wake();
	}

	void method2(TestPerson person) {
		person.wake();
	}
}
