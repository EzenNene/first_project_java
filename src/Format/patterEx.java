package Format;

import java.util.regex.Pattern;

public class patterEx {

	public static void main(String[] args) {
		String regExp = "(010|02)-\\d{3,4}-\\d{4}"; // 패턴을 넣을 문자열, 전화번호 체크
		String data = "010-123-4567";
		
		boolean result = Pattern.matches(regExp, data);
		System.out.println(result);
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "test@naver.com";
		
		result = Pattern.matches(regExp, data);
	
		System.out.println(result);
	}

}
