package test.ch06;

public class Calculator2Ex {

	public static void main(String[] args) {
//		Calculator2 calc2 = new Calculator2(); // 객체생성 (인스턴스 생성)
//		calc2.pi = 10;
		Calculator2.plus(1,2); // 객체(인스턴스)를 생성하지 않아도 접근 가능
		Calculator2.minus(1,2);
		System.out.println(Calculator2.pi);
	}

}
