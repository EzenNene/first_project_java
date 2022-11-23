package test.ch09.noname;

public class HomeEx {

	public static void main(String[] args) {
		Home home = new Home();
		home.use1();
		home.use2();
		
		home.use3(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("난방켜기");
			}

			@Override
			public void turnOff() {
				System.out.println("난방끄기");				
			}
			
		});
	}

}
