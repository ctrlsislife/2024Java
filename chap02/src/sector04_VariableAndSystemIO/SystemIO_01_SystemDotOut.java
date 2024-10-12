package sector04_VariableAndSystemIO;

public class SystemIO_01_SystemDotOut {
    public static void main(String[] args) {


        // System.out >> 시스템의 표준 출력 장치



        // 모니터로 변수값 출력하기
        // 1) println(내용) : 괄호 안의 내용을 출력하고 행을 바꿔라
        // 2) print(내용) : 괄호 안의 내용을 출력만 해라
        // 3) printf("형식문자열",값1, 값2, ...) : 괄호 안의 첫 번쨰 문자열 형식대로 내용을 출력하라.
        // 형식 문자열
        // 정수 : % d / 실수 : %10.2f / 문자열 : %s / 특수문자: \t >> 탭 , \n >> 줄 바꿈
        int value = 123;
        // print()
        System.out.print(value);
        //println()
        System.out.println(value);
        //printf()
        System.out.printf("상품의 가격:%d원\n", value);
        System.out.printf("상품의 가격:%6d원\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
        // 주석에 표기하지 않은 형식 문자열은 113page 참조


    }
}
