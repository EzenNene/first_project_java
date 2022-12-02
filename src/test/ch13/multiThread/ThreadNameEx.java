package test.ch13.multiThread;

public class ThreadNameEx {

	public static void main(String[] args) {
		// main쓰레드 이름 가져오기
		Thread mainThread = Thread.currentThread(); // 현재실행중인 쓰레드.
		System.out.println(mainThread.getName());
		
		// 쓰레드 3개생성
		for (int i = 0; i < 3; i++) {

			Thread threadA = new Thread() {

				@Override
				public void run() {
					System.out.println(getName() + "실행"); // 쓰레드 이름을 가져온다
				}

			};

			threadA.start();
		}

		// chat 쓰레드 생성
		Thread chatThread = new Thread() {

			@Override
			public void run() {
				System.out.println(getName() + "실행"); // 쓰레드 이름을 가져온다
			}

		};
		
		chatThread.setName("chat-thread"); // 쓰레드가 실행되기 전에 이름 바꾸기
		chatThread.start();
		
	}

}
