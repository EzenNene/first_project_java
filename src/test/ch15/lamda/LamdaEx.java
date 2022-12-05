package test.ch15.lamda;

public class LamdaEx {
	public static void main(String[] args) {
		action((x, y) -> {
			int result = x + y;
			System.out.println("result: " + result);
		});

		action((x, y) -> {
			int result = x - y;
			System.out.println("result: " + result);
		});
		
		// 매개변수 하나일때 괄호 생략가능
//		action(x -> Sysout.out.println(x));
	}

	public static void action(Calculable calculable) {
		//데이터
		int x = 10;
		int y = 4;
		//데이터 처리
		calculable.calculate(x, y);
	}
}