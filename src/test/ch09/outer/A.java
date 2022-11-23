package test.ch09.outer;

public class A {
	// A 클래스의 인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	// A 클래스의 정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	// 인스턴스 멤버 클래스
	class B{
		void method() {
			field1 =10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	// 정적 멤버 클래스
	static class C {
		void method() {
			// 정적멤버 클래스에서는 바깥 클래스 인스턴스 필드와 메소드에 접근 불가
			field1 =10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
}
