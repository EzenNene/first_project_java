package test.ch11.Math;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// 선택번호 (내가 선택한 번호)

		int[] selectNumber = new int[6]; // 로또번호 6개 저장될 배열
		Random random = new Random();
		System.out.println("선택번호: ");

		// 랜덤 숫자 6개 생성을 해서 배열에 넣어줌
		for (int i = 0; i < 6; i++) {

			selectNumber[i] = random.nextInt(45) + 1;
			// 1~45 범위 숫자

			for (int j = 0; j < i; j++) {
				if (selectNumber[i] == selectNumber[j]) {
					selectNumber[i] = random.nextInt(45) + 1;
				}
			}
			System.out.print(selectNumber[i] + ", ");
		}

		System.out.println("\n");

		// 당첨번호 (컴퓨터에서 주는 번호)

		int[] winNumber = new int[6]; // 당첨번호 6개 저장될 배열
		Random random2 = new Random();

		System.out.println("당첨번호: ");

		// 랜덤 숫자 6개 생성을 해서 배열에 넣어줌

//		for (int i = 0; i < 6; i++) {
//			winNumber[i] = random2.nextInt(45) + 1;
//			// 1~45 범위 숫자
//			System.out.print(winNumber[i] + ", ");
//		}

		for (int number : winNumber) {

			winNumber[number] = random2.nextInt(45) + 1;
			// 1~45 범위 숫자
			System.out.print(winNumber[number] + ", ");
		}

		// 당첨여부
		System.out.println("\n");

		Arrays.sort(selectNumber); // 비교하기 전 배열값 정렬
		Arrays.sort(winNumber); // 비교하기 전 배열값 정렬

		boolean result = Arrays.equals(selectNumber, winNumber);
		if (result == true) {
			System.out.println("당첨입니다");
		}
		System.out.println("당첨이 아닙니다");

	}

}
