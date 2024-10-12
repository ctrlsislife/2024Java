package sector01_OperatorAndExpression;

public class Operation_07_StringConcat {
    public static void main(String[] args) {
        // 문자열 결합 연산자: "String" + __ ;
        // 피연산자 중 한 쪽이 문자열이면 + 연산자가 다른 피연산자를 문자열로 변환하여 서로 결합
        // 왼쪽에서부터 오른쪽으로 연산이 수행되는 점에 유의

        String str1 = "JDK" + 6.0;
        String str2 = str1 + " 특징";
        System.out.println(str2);

        String str3 = "JDK" + 3 + 3.0; // jdk와 3의 문자열 결합 연산이 수행 된 후 산술연한이 수행 되어 jdk3과 3.0 산술되어 jdk33.0
        String str4 = 3 + 3.0 + "JDK"; // 산술 연산이 먼저 수행되어 6.0 실수값을 가지고 문자열 결합 연산되어 6.0jdk
        System.out.println(str3);
        System.out.println(str4);
    }
}
