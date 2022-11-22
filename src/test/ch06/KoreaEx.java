package test.ch06;

public class KoreaEx {

	public static void main(String[] args) {
		Korea k1 = new Korea("123456-1234567", "감자바");
		System.out.println(k1.name);
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		
		k1.name = "강희재";
		k1.nation = "미국";
		
		System.out.println(k1.name);
	}

}
