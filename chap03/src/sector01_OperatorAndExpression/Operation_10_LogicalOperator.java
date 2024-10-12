package sector01_OperatorAndExpression;

public class Operation_10_LogicalOperator {
    public static void main(String[] args) {
        // 대입 연산자 : ( = , += , -= , *=, /= , %=)
        // 대입 연산자는 오른쪽 피연산자의 값을 왼쪽 피연산자인 변수에 저장함
        // 오른쪽 피연산자에는 리터럴, 변수, 다른 연산식이 위치할 수 있다.
        // 대입 연산자는 모든 연산자 중 가장 낮은 연산 순위임에 유의
        // 연산의 진행 방향이 오른ㅉ꼬에서 왼쪽임에 유의

        int result = 0;

        result += 10; //  0 +10
        System.out.println("result=" + result); // 10

        result -= 5;  // 10 - 5
        System.out.println("result=" + result); // 5

        result *= 3; // 5 * 3
        System.out.println("result=" + result); // 15

        result /= 5; // 15 / 5
        System.out.println("result=" + result); // 3

        result %= 3; // 3을 3으로 나눈 나머지
        System.out.println("result=" + result); // 0
    }
}
