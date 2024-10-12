package sector03_Type_Promotion;

public class Promotion_01_Promotion {
    public static void main(String[] args) {
        // 자동 타입 변환 : 값의 허용 범위가 작은 타입이 허용범위가 큰 타입으로 저장될 때 발생
        //  byte 1 < short 2 < int 4 < long 8 < float < double
        // 값의 허용범위가 작은 타입이 허용범위가 큰 타입으로 자동으로 변환된다.
        // char 타입이 int로 자동 변환되면 유니코드 값이 int로 저장된다
        // byte 타입은 char 타입으로 자동 변환될 수 없는데 char 타입의 허용범위는 음수를 포함하지 않으나 byte는 음수를 포함하기 때문이다.'



        // 자동 타입 변환의 예시
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue: " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드: " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue: " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue: " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue: " + doubleValue);
    }
}
