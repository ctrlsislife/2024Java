package sector01.dahyeongseong;

public class Car {
    // field
     Tire FrLfTire = new Tire("앞왼쪽" , 6);
     Tire FrRiTire = new Tire ("앞오른쪽", 2);
     Tire bcLfTire = new Tire("뒤왼쪽", 3);
     Tire bcRiTire = new Tire("뒤오른쪽", 4);

     //생성자


    // 메소드
    int run() {
        System.out.println("주행중...");
        if(FrLfTire.roll()==false) {stop(); return 1; }
        if(FrRiTire.roll()==false) {stop(); return 2; }
        if(bcLfTire.roll()==false) {stop(); return 3; }
        if(bcRiTire.roll()==false) {stop(); return 4; }
        return 0;
    }

    void stop() {
        System.out.println("타이어의 손상 위험이 있습니다. 즉시 수리센터를 방문하십시오.");
    }
}
