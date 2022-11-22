package test.ch08.interface_extends;

public class ExtendsEx {

	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		InterfaceA ia = impl; // 자동형변환
		InterfaceB ib = impl; // 자동형변환
		InterfaceC ic = impl; // 자동형변환
		
		ia.methodA();
		ib.methodB();
		// ★ InterfaceC는 InterfaceA, InterfaceB 상속받았으므르 아래와 같이 호출 가능
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
