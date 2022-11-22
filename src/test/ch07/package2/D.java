package test.ch07.package2;

import test.ch07.package1.A;

public class D extends A{
	//protected는 상속을 통해서만 사용 가능
	public D() {
		super(); // A 클래스의 생성자 호출
	}
	
	public void method1() {
//		super.field = "1";
//		super.method();
		
		this.field = "1";
		this.method();
	}
	
	public void method() {
		// protected 사용시 직접 객체를 생성해서 사용 할 수 없음
		A a = new A();
		a.field = "1";
		a.method();
	}
	
}
