package sector02_LoopStatement;

public class Loop_02_For2 {
    public static void main(String[] args) {
        int sum =0;

        int i = 0;  // int를 for문 전에 선언
        for(i=1; i<=100; i++) {
            sum += i;
        }

        System.out.println("1~" + (i-1) + "합 : " + sum); // int를 for문 전에 선언하여 전역변수이므로 for문 밖에서 i 사용 가능
    }
}
