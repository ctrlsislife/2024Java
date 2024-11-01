package sector05_member;

public class Member_01_ThisInstance {

    // 필드 생성
    String model;
    int speed;

    // 생성자
    Member_01_ThisInstance(String model) {
        this.model = model; // 자기 자신의 model 필드(인스턴스 멤버)
    }

    // 메소두
    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        for(int i= 10; i <= 50; i+=10){
            this.setSpeed(i);
            System.out.println(this.model + "가 달립니다.(시속:" + this.speed +"km/h)");
        }
    }


}
