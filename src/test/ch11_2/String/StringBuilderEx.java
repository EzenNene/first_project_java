package test.ch11_2.String;

public class StringBuilderEx {

	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")	// 문자열 끝에 추가
				.insert(0, "abc")	// 문자열을 지정위치에 넣어줌(위치, 문자열)
				.delete(3, 4)	// 문자열 일부를 삭제(시작위치, 끝위치) 3번이상 4번 미만
				.toString();	// 완성된 문자열을 String 타입으로 리턴
		
		System.out.println(data);
	}

}
