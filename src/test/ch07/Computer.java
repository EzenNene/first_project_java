package test.ch07;

public class Computer extends Calculator {

	// 오버라이드: 부모클래스의 메소드 재정의(반환타입, 메소드 이름, 매개변수 같아야함)
	@Override
	public double areaCircle(double r) {
		System.out.println("computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
