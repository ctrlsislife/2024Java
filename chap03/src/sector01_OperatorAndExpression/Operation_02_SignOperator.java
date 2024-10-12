package sector01_OperatorAndExpression;

public class Operation_02_SignOperator {
    public static void main(String[] args) {
        // signOperator : 부호 연산자
        // 양수 및 음수임을 표시하는 + , -
        // 불타입과 char 타입 제외 나머지 기본 타입에서 사용 가능하다
        // 부호 연산의 결과는 int 타입이므로 int 타입 변수로 저장해야 한다.
        // +, - 는 산술 연산자임과 동시에 부호 연산자이지만 부호 연산자로 쓰일때는 하나의 피연산자 앞에 위치한다
        // ex) +x , -102

        int x = -100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);

        byte b = 100;
        // byte result3 = -b; // byte 타입을 부호 연산하면 int로 바뀌므로 byte로 선언시 컴파일 에러 발생
        int result3 = -b;
        System.out.println("result3=" + result3);
    }
}
