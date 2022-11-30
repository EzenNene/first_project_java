package test.ch11_2.Object;

public class Student {



	// 필드
	private int no;
	private String name;
	
	// 생성자
	public Student(int no, String name) {
		//필드에 초기값 할당
		this.no = no;	
		this.name = name;
	}
	
	// 메소드
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	
	// object 라이브러리로부터 hashCode 함수 오버라이드
	// hashCode 함수는 인트값을 반환함
	
	public int hashCode() {
		System.out.println("no: " + no + " ," + " name: " + name.hashCode());
		int hashCode = no + name.hashCode(); 
		// 번호하고 이름 같으면 동일한 값 생성
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {		// obj가 Student 객체 갖고 있는가
			Student target = (Student)obj; 	// 강제타입변환
			
			// no하고 name(String의 equals사용)의 값이 같은지 비교
			if (no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
}






