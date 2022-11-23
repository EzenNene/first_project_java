package test.ch10;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			class.forName("java.lang.String");
			System.out.println();
		} catch (ClassNotFoundExep e);
		e.printStackTace();
	}

}
