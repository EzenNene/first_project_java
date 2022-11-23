package test.ch09;

public class ALocal {
	void useB(int arg) { // final int age
		
		// 로컬변수
		int var = 1; // final int var
		
		
		class B {
			// 인스턴스 필드
			int field1 = 1;
			
			// 생성자
			B() {
				System.out.println("B생성자 실행");
			}
			
			// 인스턴스 메소드
			void method1() {
				System.out.println("B메소드 실행");				
			}
			
			void method2 () {
				arg = 2;
				var = 2;
			}
		}
		
		// 메소드 안에서 객체생성
		B b = new B(); // 생성자 실행
		System.out.println(b.field1);
		b.method1();
	}
	

}
