package sector02_LoopStatement;

public class Loop_04_ForMultiplication {
    public static void main(String[] args) {

        // 중첩 for문 : for문 안의 for문
        // 바깥 for문 (위에 위치한 for문)이 한 번 실행될 때마다 중첩된 for문이 지정된 횟수만큼 반복하여 돌다가 다시 바깥쪽 for문으로 돌아감


        for (int m = 2; m <= 9; m++) { // 바깥 for문
            System.out.println("*** " + m + "단 ***");

            for (int n = 1; n <= 9; n++) { // 중첩 for문
                System.out.print(m + " x " + n + " = " + (m * n));

                // 실행상황
                // 1) 10라인의 바깥 for문은 mdl 2~9까지 변하면서 9번 반복 실행
                // 2) 바깥 for문이 한번 실행 될 때마다 13라인의 중첩 for문은 n이 1~9까지 변하면서 9번 반복 실행
                // 즉, m = 2일때 n은 1~9까지 변하면서 2 x n = 2 * n 출력
            }
        }
    }

    }
