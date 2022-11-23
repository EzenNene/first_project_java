package test.ch10;

public class ExceptionEx1 {

	public static void printLength(String data) {
		
		try { // 실행시킬 코드 작성
			int result = data.length(); // 문자 수
			System.out.println("문자 수: " + result);
		} catch(NullPointerException e) { // 에러가 났을 때 실행시킬 코드를 작성
			
			// 예외처리 정보를 얻는 세가지 방법	
//			System.out.println(e.getMessage()); // 예외발생 이유만 리턴
//			System.out.println(e.toString());	// 예외발생이유 + 예외종류
			e.printStackTrace();				// 예외발생이유 + 예외종류 + 예외발생장소
			
		} finally { // finally: 옵셔널, 마지막에 무조건 실행 
			System.out.println("마무리 실행\n");			
		}
		
	}	
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("프로그램 종료");
	}

}
