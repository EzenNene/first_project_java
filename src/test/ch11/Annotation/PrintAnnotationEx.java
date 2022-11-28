package test.ch11.Annotation;

import java.lang.reflect.*;

public class PrintAnnotationEx {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			// PrintAnnotation 얻기
			PrintAnnotation printAno = method.getAnnotation(PrintAnnotation.class);
			
			printLine(printAno);
			
			method.invoke(new Service());	// 메소드 실행
		}
	}

	public static void printLine(PrintAnnotation printAno) {
		if (printAno != null) {
			// number속성 값 얻기
			int number = printAno.number();
			String value = printAno.value();
			
			System.out.println(number);
			System.out.println(value);
		}
	}
	
}
