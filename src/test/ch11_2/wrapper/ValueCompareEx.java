package test.ch11_2.wrapper;

public class ValueCompareEx {

	public static void main(String[] args) {
		Integer obj1 = 300; // 객체
		Integer obj2 = 300;
		System.out.println(obj1 == obj2); // 객체주소 비교
		System.out.println(obj1.equals(obj2));
		System.out.println();
		
		// [값을 비교하는 타입]
		// Boolean
		// Character
		// Byte, Short, Integer : -128 ~ 127
		
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println(obj3 == obj4); // 객체주소아닌 값 비교
		System.out.println(obj3.equals(obj4));
	}

}
