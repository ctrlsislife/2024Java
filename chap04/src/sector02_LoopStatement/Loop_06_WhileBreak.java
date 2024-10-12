package sector02_LoopStatement;

public class Loop_06_WhileBreak {
    public static void main(String[] args) {
        //break 문 : 반복문을 실행 중지할 때 사용됨

        while (true) {
            int num = (int) (Math.random() * 6) + 1; // 주사위 뽑는 코드
            System.out.println(num);
            if (num == 6) { // 주사위가 6이면 루프를 빠져나가는 코드
                break;
            }
        }
        System.out.println("End of loop");
    }
}
