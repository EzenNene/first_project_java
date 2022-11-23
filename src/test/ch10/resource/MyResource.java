package test.ch10.resource;

public class MyResource implements AutoCloseable {
	// 필드
	private String name;
	
	// 생성자
	public MyResource(String name) {
		this.name = name;
		System.out.println("MyResource" + name + "열기");
	}
	
	// 메소드
	public String read1() {
		System.out.println("MyResource" + name + "읽기");		
		return "100";
	}
	
	public String read2() {
		System.out.println("MyResource" + name + "읽기");
		return "abc";
	}

	@Override
	public void close() throws Exception { // 닫아주는 메소드
		// 파일을 닫을 때 실행하는 코드
		System.out.println("MyResource" + name + "닫기");

	}
	
}
