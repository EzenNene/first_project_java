package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;
import test.ch06.exam01.pakage1.B;

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1; 
		a.field2 = 1;
		a.field3 = 1;
		
		a.method1();
		a.method2();
		a.method3();
	}
	
	
//	A a1 = new A(true); // A클래스(default) 접근 가능
//	A a2 = new A(1);
//	A a3 = new A("문자열");
}
