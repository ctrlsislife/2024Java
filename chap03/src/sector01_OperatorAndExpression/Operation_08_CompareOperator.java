package sector01_OperatorAndExpression;

public class Operation_08_CompareOperator {
    public static void main(String[] args) {
        // 비교 연산자 ( < , <= , > , >= , == , != )
        // == : 두 피연산자의 값이 같은지 검사
        // != : 두 피연산자으 값이 다른지 검사
        // true / false 값으로 반환 됨
        // 대소 연산자 : 불타입 제외 기본 타입 사용 가능
        // 동등 연산자 == , != : 모든 타입에 사용 가능

        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);
        System.out.println("result3=" + result3);

        // char 타입의 비교 연산
        char char1 = 'A'; // A문자의 유니코드 값 65
        char char2 = 'B'; // B문자의 유니코드 값 66
        boolean result4 = (char1 < char2); // 65<66
        System.out.println("result4=" + result4);
    }
}
