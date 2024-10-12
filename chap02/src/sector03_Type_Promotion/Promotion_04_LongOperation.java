package sector03_Type_Promotion;

public class Promotion_04_LongOperation {
    public static void main(String[] args) {

        // long 타입이 사용된 정수 연산

        // 정수 연산에서 int 보다 허용 범위가 더 큰 long 타입이 피연산자로 사용 된 경우
        // 다른 피연산자는 모두 long 타입으로 변환된다
        // 연산 결과를 long 타입 변수에 저장해야 컴파일이 정상적으로 수행된다
        byte value1 = 10;
        int value2 = 100;
        long value3 = 1000L;
        long result = value1 + value2 + value3;
        System.out.println(result);
    }
}
