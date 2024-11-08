package sector01.dahyeongseong;

public class KumhoTire extends Tire {

    // field

    // 생성자
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    // Method
    @Override
    public boolean roll(){
        ++accumulatedRotation;
        if(accumulatedRotation < maxRotation){
            System.out.println(location + " KumhoTire 잔여수명: " + (maxRotation - accumulatedRotation) +"회");
            return true;
        } else {
            System.out.println("*** " + location + " KumhoTire 펑크 ***");
            return false;
        }
    }
}
