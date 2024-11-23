package sector04_dahyeongseong.InsteadOf;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { // vehicle이 참조하는 객체가 버스인지 조사
			Bus bus = (Bus) vehicle; // 버스인 경우 캐스팅
			bus.checkFare();
		}
		vehicle.run();
	}
}
