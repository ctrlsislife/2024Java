package sector05_member;

public class Member_09_StaticFinal {
    // 불변의 값 : 상수 (static final)
    // 원주율이나 지구 무게 및 둘레 등
    // final은 객체마다 저장되고 생성자의 매개값 통해 여러 값을 가질 수 있지만
    // 상수는 클래스에만 존재하고 하번 초기값 지정되면 변경할 수 없다.
    // static final  타입 상수 = 초기값;
    static final double EARTH_RADIUS = 6378.137;
    static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
}
