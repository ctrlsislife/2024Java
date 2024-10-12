package sector01_OperatorAndExpression;

public class Operation_09_CompareOperator2 {
    public static void main(String[] args) {

        // 비교 연산자도 연산 수행 전 피연산자의 타입을 일치시키는 점에 유의
        int v2 = 1;
        double v3 = 1.0;
        System.out.println(v2 == v3); // true

        // 실수의 경우 실수 저장 방식인 부동 소수점 방식이 0.1을 정확하게 표현할 수 없음
        // 0.1f >> 0.1의 근사값(0.100000001490111612)로 표현되어 0.1보다 큰 값으로 처리 됨.
        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println(v4 == v5); //false
        System.out.println((float)v4 == v5); //true // 해결방안으로써 피연산자 모두를 float로 변환하여 비교하면 됨
    }
}
