package test.ch01_3;

public class LogicalOperator {

	public static void main(String[] args) {
		int charCode = 'A';
//		65로 바꿔줌
		
		if ((65 <= charCode) & (charCode <= 90)) {
			// 65 ~ 90
			System.out.println("대문자군요");
		}
		
		if ((97 <= charCode) && (charCode <= 122)) {
			// 97 ~ 122
			System.out.println("소문자군요");
		}
		
		if ((48 <= charCode) && (charCode <= 57)) {
			// 48 ~ 57
			System.out.println("0~9 숫자");
		}

		int value = 6;
		
		if ((value%2 == 0) | (value%3 == 0)) {
			System.out.println("2또는 3의배수");
		}
		
		if ((value%2 == 0) || (value%3 == 0)) {
			System.out.println("2또는 3의배수");
		}
		
		
	}

}
