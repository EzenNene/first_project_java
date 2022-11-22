package test.ch01;

public class Hello {

	public static void main(String[] args) {
		
		int var1 = 0b1011; 	//2진수
		int var2 = 0206; 	//8진수
		int var3 = 365;		//10진수
		int var4 = 0xB3; 	//16진수
		char c1 = 'A'; // 작은 따옴표, 문자 1개
		char c2 = 65;
		
		float var7 = 0.123412341255f;
		double var8 = 0.123412341255;
		double var9 = 3e6; // 3.0 * 10^6
		double var10 = 2e-3; // 2.0 * 10^-3
		float var11 = 3e6f; 
		
		boolean stop = true;
		
		int x =10;
		boolean result1 = (x == 20);
		
		System.out.print(result1);
		
		if (stop) {
			System.out.println("장비를 정지합니다");
		}
		
		String name ="나는 \'강희재\' 입니다"; // 큰 따옴표, 문자1개 혹은 여러개
		String one = "A";
		System.out.println(name);
		
