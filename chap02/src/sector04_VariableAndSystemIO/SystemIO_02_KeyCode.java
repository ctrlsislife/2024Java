package sector04_VariableAndSystemIO;

public class SystemIO_02_KeyCode {
    public static void main(String[] args) throws Exception {
        //keycode로 입력 버튼 받기

        // main()메소드 끝에 throw Exception은 System.in.read()에 대한 예외 처리 코드
        // System.in : 시스템 표준 입력 장치
        // 예외 처리 : 시스템에 예외가 발생했을 때 어떻게 처리할 것인지를 정하는 것
        // 예외 처리의 throws Exception : 단순히 모니터에 예외 내용을 출력만 수행
        // keycode : 키보드의 입력 버튼에 대한 아스키코드 번호
        // ENTER : Carrier Return >> 13 , Line Feed >> 10 실행
        int keyCode;

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);


    }
}
