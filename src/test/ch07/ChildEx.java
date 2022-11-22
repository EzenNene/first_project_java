package test.ch07;

public class ChildEx {

	public static void main(String[] args) {
//		//자식 객체 생성
//		Child child = new Child();
//		
//		Parent parent = child; // 자동타입변환
//		parent.method1();
//		parent.method2(); // ★오버라이드 된 메소드를 불러온다 (Child 클래스의 함수)
////		parent.method3(); // ★자식 객체에 있는 메소드는 불러오지 못함
//		
//		parent.a = 2;
////		parent.b = 1; // 자식 객체에 있는 필드는 불러오지 못함
		
		Parent parent = new Child(); // 자동타입변환
		
		
		// instanceof : 객체타입 확인을 위한 연산자
		// parent가 child 객체를 담고있지 않다면 강제타입변환불가
		
		//instanceof: 객체타입 확일을 위한 자바에서 제공하는 연산자
		
		if(parent instanceof Child) { // parent 매개변수가 child 객체 담고있나?
			
			Child child = (Child)parent; // 강제타입변환. 주로 자동타입변환 이후에 함
			child.b = 1; // 자식 객체에 있는 필드에 접근가능
			child.method3(); // 자식 메소드에 있는 필드에 접근ㄴ가능
			
		}
		
		
		
	}

}
