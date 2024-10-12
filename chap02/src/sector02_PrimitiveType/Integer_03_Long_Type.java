package sector02_PrimitiveType;

public class Integer_03_Long_Type {
    public static void main(String[] args) {

        // 기본적으로 컴파일러가 정수 리터럴을 int로 간주해버림
        long var1 = 10;
        long var2 = 20L;
        // long var3 = 1000000000000; // int 타입 허용범위 -2,147,483,648 ~ 2,147,483,647 초과 >> 컴파일 에러
        long var4 = 1000000000000L; // 정수 리터럴 뒤에 L을 붙여 long 타입임을 선언
        // 정수 리터럴이 int 허용범위 이내라면 정상 컴파일 되므로 뜬끔없이 리터럴 선언에서 오류 난다면 L을 붙여보자
    }
}
