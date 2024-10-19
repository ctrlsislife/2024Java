package sector02_field;

public class Fleid_02_CarMain {
    public static void main(String[] args) {


        Field_01_Car myCar = new Field_01_Car(); // 객체생성


        // 필드값 읽어들이기
        System.out.println("제작회사: "+myCar.company);
        System.out.println("모델명: "+myCar.model);
        System.out.println("색깔: "+myCar.color);
        System.out.println("최고속도: "+myCar.maxSpeed);
        System.out.println("현재속도: "+myCar.speed);


        // 필드값 수정하는법
        myCar.speed = 60;
        System.out.println("수정된 속도: "+ myCar.speed);

    }
}
