package sector03_Type_Promotion;

public class Promotion_05_OperationsPromotionExamples {
    public static void main(String[] args) {

        // byte의 int 자동 변환
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        // byte byteValue3 = byteValue1 + byteValue2;
        // byte 타입 산술연산의 결과인 byteValue3를 int가 아닌 byte로 사용하였으므로 8라인은 컴파일 에러 발생
        int intValue1 = byteValue1 + byteValue2;
        System.out.println(intValue1);


        // char의 int 자동 변환
        char charValue1 = 'A';
        char charValue2 = 1;
        //char charValue3 = charValue1 + charValue2;
        // char 타입 또한 산술연산의 결과인 charValue3를 표현하기 위해선 int 타입 사용해야하므로 18라인 컴파일 에러 발생
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드=" + intValue2);  // char타입이 int로 자동변환 된 경우 유니코드 값이 int로 저장
        System.out.println("출력문자=" + (char) intValue2); // 문자를 출력하기 위해 int에서 char로 강제 변환

        // 정수 연산과 실수 연산 변환 비교
        int intValue3 = 10;
        //int intValue4 = 10 / 4.0;
        // 실수를 표현하기 위해선 double로 자동 변환 해야 하므로 26라인은 컴파일 에러 발생
        int intValue4 = intValue3 / 4; // 결과값을 정수로 표출
        System.out.println(intValue4);
        double doubleValue = intValue3 / 4.0;
        System.out.println(doubleValue);


        int x = 1;
        int y = 2;
        double result = (double) x / y;  //실수로 연산 결과를 나타내기 위해 double로 강제 변환
        System.out.println(result);




    }
}
