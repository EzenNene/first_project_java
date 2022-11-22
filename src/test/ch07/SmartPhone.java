package test.ch07;

// 자식 클래스
public class SmartPhone extends Phone {

	// 필드
//	public String model; 상속받음
//	public String color; 상속받음
	public boolean wifi;
	
	// 생성자
	public SmartPhone(String model, String color){
		super(model, color); // 부모생성자 호출
		System.out.println("자식 생성자 호출");
		this.model = model;
		this.color = color;
	}
	
	// 메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
	
}
