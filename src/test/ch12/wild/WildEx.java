package test.ch12.wild;

class Applicant<T> {
	
	public T kind;
	
	// 생성자
	public Applicant (T kind) {
		this.kind = kind;
	}
}

//================================================

class Person {}

class Worker extends Person {}

class Student extends Person {}

class HighStudent extends Student {}
class MiddleStudent extends Student {}

//================================================

class Course {
	
	// 모든 사람이 수강신청 가능
	public static void registerCourse1(Applicant<?> applicant) {
		// 해당클래스의 이름을 가져온다. 사용기술: 리플렉션
		System.out.println(applicant.kind.getClass().getSimpleName() 
				+ "이 Course1을 등록");
	}
	
	// 학생만 수강신청 가능
	// 자기 자신과 하위 클래스만 제네릭타입으로 사용 가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+ "이 Course2을 등록");
	}
	
	// 직장인 및 일반인만 수강신청 가능
	// 자기 자신과 부모 클래스만 제네릭타입으로 사용 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+ "이 Course3을 등록");
	}
	
}

//================================================
	
public class WildEx {

	public static void main(String[] args) {
		// 모든 사람이 신청 (static으로 만들어 놓아서 객체 만들지 않아도 됨)
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		System.out.println();
		
		// 학생만 신청
//		Course.registerCourse2(new Applicant<Person>(new Person()));
//		Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		System.out.println();
		
		// 직장인 및 일반인 신청
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
//		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
//		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
//		Course.registerCourse3(new Applicant<Student>(new Student()));
	}

}
