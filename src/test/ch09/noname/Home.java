package test.ch09.noname;

public class Home {
	// 필드에 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("티비켜기");
		}

		@Override
		public void turnOff() {
			System.out.println("티비끄기");
		}
		
	
	};
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	// 메소드 (로컬변수 이용)
	public void use2() {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");				
			}
			
		};
		
		rc.turnOn();
		rc.turnOff();
	}
	
	// 메소드(매개변수 이용)
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
	
}
