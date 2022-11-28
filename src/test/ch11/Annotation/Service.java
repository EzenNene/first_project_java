package test.ch11.Annotation;

public class Service {
	
//	@PrintAnnotation
//	String test;
	
//	@PrintAnnotation
//	Service(){
		
	
	
	@PrintAnnotation
	public void method1() {
		System.out.println("method1");
	}
	@PrintAnnotation
	public void method2() {
		System.out.println("method2");				
	}
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("method3");				
	}
	
}
