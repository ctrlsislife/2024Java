package sector01.dahyeongseong;

public class HankookTire extends Tire{

    // 필드

    // 생성자
    public HankookTire(String location, int maxRotation) {
        super (location, maxRotation);
    }

    // Method
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation < maxRotation) {
            System.out.println(location + "한국타이어 잔여 수명: " + (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("***" + location + "HankookTire 타이어 손상 ***");
            return false;
        }
    }

}
