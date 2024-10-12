package sector02_LoopStatement;

public class Loop_07_BreakOutter {
    public static void main(String[] args) {
        // 중첩 반복문의 break 사용
        // 반복문 중첩시 가장 가까운 반복문만 종료하고 바깥 반복문은 종료하지 않는다.

        // 바깥 반복문까지 종료시키고 싶을 경우
        // 바깥 반복문에 Label: 붙이고 break Label; 하면 된다. (Label 이름은 자유롭게)
        Outter: for(char upper='A'; upper<='Z'; upper++) { // 바깥 for : A~Z 반복
                    for(char lower='a'; lower<='z'; lower++) { // 중첩 for : a~z 반복
                        System.out.println(upper + "-" + lower);
                        if(lower=='g'){ // 중첩 for의 lower 변수가 g를 갖게 되면
                            break Outter; // 바깥쪽 for문도 종료
                        }
                    }
        }
        System.out.println("종료");
    }
}
