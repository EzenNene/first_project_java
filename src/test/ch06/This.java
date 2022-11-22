package test.ch06;

public class This {

	// 필드
	String model;
	int speed;
	
	// 생성자
	// 매개변수명이 필드에있는 데이터명과 같으면 필드데이터에는 this를 붙인다.
	This(String model2){
		model = model2;
	}
	
	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run () {
		this.setSpeed(100); // 같은 클래스 간의 메소드 호출시 this 생략가능
		System.out.println(this.model + "," + this.speed);
	}
	
	
	
}
