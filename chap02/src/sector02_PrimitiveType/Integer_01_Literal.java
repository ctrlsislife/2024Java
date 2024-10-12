package sector02_PrimitiveType;

public class Integer_01_Literal {
    public static void main(String[] args) {

        // 리터럴 >> 소스 코드에서 프로그래머에 읳 ㅐ직접 입력된 값

        int var1 = 0b1011; // 2진수 : 0b 또는 0B로 시작하고 0과 1로 구성
        int var2 = 0206;   // 8진수 : 0으로 시작하고 0~7 숫자로 구성
        int var3 = 365;    // 10진수 : 소수점이 없는 0~9 숫자로 구성
        int var4 = 0xB3;   // 16진수 : 0x 또는 0X로 시작하고 0~9까지 숫자와 10이상 부터 순서대로 A, B, C, D, E, F 로 구성

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
    }
}
