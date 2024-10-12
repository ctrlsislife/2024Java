package sector03_Type_Promotion;

public class Promotion_06_StringContact {
    public static void main(String[] args) {

        // + 연산에서 문자열 자동 타입 변환
        // + 연산자의 두가지 기능
        // 1) 피연산자가 모두 숫자일 경우 덧셈 연산을 수행
        // 2) 피연산자 중 하나가 문자열일 경우 나머지 피연산자도 문자열로 자동 변환되어 문자열 결합 연산 수행


        // 일반적인 숫자 연산
        int value = 10 + 2 + 8;
        System.out.println("value: " + value);

        // 문자열 결합 연산
        String str1 = 10 + 2 + "8";
        System.out.println("str1: " + str1);

        String str2 = 10 + "2" + 8;
        System.out.println("str2: " + str2);

        String str3 = "10" + 2 + 8;
        System.out.println("str3: " + str3);

        String str4 = "10" + (2 + 8);
        System.out.println("str4: " + str4);

        // 즉 , 하나라도 String 이면 모두 다 String으로 바뀜
    }
}
