package test.ch07.poly;

public class InstanceofEx {

	//객체 생성 안하고도 호출할 수 있는 함수
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		
		if (person instanceof Student) { // person이 student 객체를 참조하는가?
			Student student = (Student) person;
			
			student.study();
			System.out.println(student.studentNo);
		}
		
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		// 홍길동을 매개변수로 받는 Person 클래스의 생성자 실행
		personInfo(p1);
		
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
	}

}
