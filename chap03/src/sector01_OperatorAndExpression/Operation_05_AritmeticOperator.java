package sector01_OperatorAndExpression;

public class Operation_05_AritmeticOperator {
    public static void main(String[] args) {
        // 산술 연산자( +, -, *, /, %)
        // 순서대로 4개는 사칙연산 , %는 왼쪽 피연산자를 오른쪽 피연산자로 나눈 나머지를 구하는 연산
        // 산술 연산시 피연산자들의 타입이 동일하지 않을 경우 아래의 2 규칙을 통해 피연산자들의 타입을 통일 시켜 연산 수행
        // 1) long 타입 제외 정수 타입 연산은 int타입으로 산출
        // 2)  피연산자 중 하나라도 실수 타입이라면 실수 타입으로 산출

        int v1 = 5;
        int v2 = 2;

        int result1 = v1 + v2;
        System.out.println("result1=" + result1);

        int result2 = v1 - v2;
        System.out.println("result2=" + result2);

        int result3 = v1 * v2;
        System.out.println("result3=" + result3);

        int result4 = v1 / v2;
        System.out.println("result4=" + result4);

        int result5 = v1 % v2;
        System.out.println("result5=" + result5);

        double result6 = (double) v1 / v2;  // int 값을 double로 강제 변환
        System.out.println("result6=" + result6);
    }
}
