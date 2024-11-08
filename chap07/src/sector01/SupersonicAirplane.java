package sector01;

public class SupersonicAirplane extends Airplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly(){
        if(flyMode == SUPERSONIC){
            System.out.println("Supersonic Flying");
        } else {
            super.fly(); // airplane 객체의 함수 호출
        }
    }

}
