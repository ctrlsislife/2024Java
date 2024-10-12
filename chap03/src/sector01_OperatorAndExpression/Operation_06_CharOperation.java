package sector01_OperatorAndExpression;

public class Operation_06_CharOperation {
    public static void main(String[] args) {

        // char 타입의 산술 연산
        // char 타입도 정수 타입이므로 산술연산이 가능하지만 int 타입으로 변환된다는 것에 주의
        char c1 = 'A' + 1;
        // 리터럴 A에 1을 더한 것이므로 A문자의 유니코드 65에 1을 더한 66이 됨


        char c2 = 'A';
        // char c3 = c2 + 1; // 변수 c2와 1을 더하면 c2는 int로 변환되고 1과 연산 되어 연산 결과는 int 타입이 됨
        // 그러나 char 타입인 c3에 저장하려고 하므로 컴파일 에러가 발생함
        char c3 = (char) (c2 + 1);
        // 이와 같이 강제 타입 변환을 수행해야 정상적으로 컴파일 됨

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);

    }
}
