package test.ch13.mainthread;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {
		// 비프음 관련 클래스
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 빔소리를 냄

			try {
				Thread.sleep(500); // 0.5초

			} catch (Exception e) {

			}

		}

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 0.5초

			} catch (Exception e) {

			}
		}
	}
}
