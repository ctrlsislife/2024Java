package sector04_VariableAndSystemIO;

public class SystemIO_03_ContinueKeycode {
    public static void main(String[] args) throws Exception {
        // 입력된 키 개수와 상관없이 키코드를 읽는 방법
        int keyCode;

        // while 문 통해 10~11 라인을 무한히 반복시키면 됨
        while (true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);

            // while문만 둔다면 반복을 종료하려면 console에서 강제 종료를 시켜야 하므로
            // 관행적인 탈출 버튼인 q를 눌렀을때 반복이 중지되도록 하는 코드를 만들어야함
            if (keyCode == 113) { // q가 입력되었는지 확인하는 코드
                // 113: q 버튼에 할당된 코드
                break;
            }
        }

        System.out.println("종료");
    }
}
