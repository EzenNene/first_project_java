package test.ch04;

public class Conditional_test {

	public static void main(String[] args) {
		
////		1-1
//		
//		int x=1;
//		
//		if (10 < x && x <200) {
//			
//		}
//
////		1-2
//		
//		char ch = ' ';
//		
//		if (!(ch = ' ' && ch = '\t')) {
//			
//		}
//		
//		
////		1-3
//		
//		char ch = ' ';
//		
//		if (ch = 'x' && ch = 'X') {
//			
//		}
//		
////		1-4
//		
//		char ch = ' ';
//		
//		if ( 0 <= ch <=9 ) {
//			
//		}
//		
////		1-5
//		
//		char ch = ' ';
//		
//		if ( )
//			
////		1-6
//			
//		int year = ' ';
//		
//		if (year % 400 = 0 && ( year % 4 = 0 year % 100 != 0 )) {
//			
//		}
		
////		1-7
//		
//		boolean powerOn = false;
//		
//		if (!(powerOn)) {
//			System.out.println(1);
//		}
		
////		1-8
//		
//		String str = "yes";
//		
//		if (str == "yes") {
//			System.out.println(1);
//		}
		
////		2
//		
//		int i = ' ';
//		int j = ' '; 
//		
//		int sum = ' ';
//		
//		for (i=1; i<=100; i++) {
//			for (j=i; j%3 == 0; j++) {
//				sum += j;
//			}
//		}
//		
//		System.out.println(sum);
//		// 1715

//		3
		
//		int i = ' ';
//		int sum = 0;
//		
//		for (i=1; i<= 20; i++) {
//			if((i%2!=0 && i%3!=0)) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
//		for문 반복멈춤!!!
		
//		int i = ' ';
//		int sum = ' ';
//		
//		for (i=1; !(i%2==0 || i%3==0) && i <= 20; i++) {
//			sum += i;
//		}
//		
//		System.out.println(sum);
		
		
//		4
		
//		int 눈1 = 0;
//		int 눈2 = 0;
//		
//
//		while (!(눈1 + 눈2 == 5)) {
//			눈1 = (int)(Math.random()*6)+1;
//			눈2 = (int)(Math.random()*6)+1;
//		}
//		System.out.println(눈1 + ":" +눈2);
		
//		5
		
//		int x = 1;
//		int y = 1;
//		
//		for (x=1; x<=10; x++) {
//			for (y=1; y <=10; y++) {
//				if (4*x + 5*y == 60) {
//					System.out.println(x + "," + y);
//				}
//			}
//		}
		
		
//		6
		
		int sum = 0;
		int sign = -1;
		int x = 1;
		
		for(x=1; true; x++,sign = -sign) {
			sum += x * sign;
			
			if (sum >= 100)
				break;
		}
		System.out.println(sum);
		
		
		
//		while (true) {
//			
//			for (x=1; x<1000; x+=2) {
//				
//			}
//			
//			for (y=-2; y>-1000; y-=2) {
//			
//			}
//			
//			sum += x + y;
//				if (sum>=100)  
//					break;
//		}
//				
//		System.out.println(sum);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}