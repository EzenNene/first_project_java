package test.ch08.type2;

public class CastEx {

	public static void main(String[] args) {
		/*
		Vehicle vehicle = new Bus(); //자동타입변환 (자동형변환)
		vehicle.run();
//		vehicle.checkFare();
		
		Bus bus = (Bus) vehicle; // 강제형변환
		bus.run();
		bus.checkFare();
		 */
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		ride(taxi);
		ride(bus);
	}
	
	public static void ride(Vehicle vehicle) {
		// vehicle 이 Bus 객체를 가지고 있나 ?
		// Vehicle vehicle = new Bus(); ?
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
	}

}
