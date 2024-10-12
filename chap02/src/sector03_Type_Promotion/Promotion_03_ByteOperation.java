package sector03_Type_Promotion;

public class Promotion_03_ByteOperation {
    public static void main(String[] args) {

        // 정수 연산에서의 자동 타입 변환
        // 정수 타입 변수가 산술 연산식에서 피연산자로 사용되면 int 보다 작은 byte, short는 int로 자동으로 변환되어 연산 수행
        // 피연산자 : x , y 등

        byte result1 = 10 + 20;  // 컴파일 단계서 10+20을 연산해 30을 만들고 result 변수에 30을 저장함
        // 피연산자가 변수가 아니므로 int로 자동 변환 하지 않음
        System.out.println(result1);

        // 정수연산시 자동 변환 예시
        byte x = 10;
        byte y = 20;
        int result2 = x + y;
        System.out.println(result2);  // byte 타입을 상위 단위인 int로 자동 변환 하여 연산 수행
    }
}
