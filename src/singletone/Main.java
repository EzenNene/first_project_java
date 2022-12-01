package singletone;

public class Main {

	public static void main(String[] args) {
		
		User[] user = new User[10]; 
		// user객체 담을 배열생성
		
		for(int i=0; i<user.length; i++) {
			user[i] = new User("user" + i);
			user[i].print(); // 생성한 객체에서 print()메소드 실행
		}
	}

}
