package Format;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df;
		
		df = new DecimalFormat("#,###");	// 포맷을 정한다.
		System.out.println(df.format(num));	// 포맷을 적용.
		// df 객체에 format 함수 사용
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
	}

}