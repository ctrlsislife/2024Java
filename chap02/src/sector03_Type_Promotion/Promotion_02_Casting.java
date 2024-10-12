package sector03_Type_Promotion;

public class Promotion_02_Casting {
    public static void main(String[] args) {
        // 강제 타입 변환(캐스팅) : 큰 허용 범위 타입을 작은 허용 범위 타입으로 강제로 나눠서 저장하는 것
        // 캐스팅 연산자 ( ) 를 사용하며 괄호 안에 들어가는 타입은 나누는 하위 단위임


        // 강제 타입 변환 예시
        int intValue = 44032;
        char charValue = (char) intValue;
        System.out.println(charValue);

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue);

    }
}
