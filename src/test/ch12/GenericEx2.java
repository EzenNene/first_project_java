package test.ch12;

class Car{}
class Tv{}

class GenericEx2{
	public static void main(String[] args) {
		// 제너릭을 이용해서 다양한 제품을 생산할 수 있다
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트 TV");
		
		Tv t = product1.getKind();
		String tmodel = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("전기자동차");

		
		System.out.println(product1.getModel());
		System.out.println(product2.getModel());
	}
}

class Product<K,M> { // 타입 파라미터 정의
	
	// 필드
	private K kind;
	private M model;
	
	// 겟셋
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
}
