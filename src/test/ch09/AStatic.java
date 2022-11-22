package test.ch09;

public class AStatic {
	// public, private, default 접근제한자 사용가능
	static class B {
	}
		// 1. 인스턴스 필드로 사용
		B field = new B();
		
		// 정적필드값으로 사용
	
		// 2. 생성자에서 사용
		AStatic () {
			B b = new B();
		}

		// 3. 인스턴스 메소드에서 사용가능
		void method1() {
			B b = new B();		
		}
		
		// 정적 메소드에서 사용가능
		static void method2() {
			B b =new B();
		}
}