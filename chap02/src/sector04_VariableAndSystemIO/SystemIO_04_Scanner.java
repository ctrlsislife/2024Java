package sector04_VariableAndSystemIO;

import java.util.Scanner; // 스캐너가 java.util 패키지에 있다는 것을 컴파일러에게 알림(이 코드를 쓰지 않으면 스캐너를 찾지 못함)

public class SystemIO_04_Scanner {
    public static void main(String[] args) throws Exception {

        // scanner클래스의 사용
        // System.in.read()의 단점을 보완
        // System.in.read()는 키코드를 하나씩 읽기에 2개 이상 키가 조합된 한글을 읽지 못함
        // System.in.read()는 입력된 내용을 통 문자열로 읽지 못함
        Scanner scanner = new Scanner(System.in); // new Scanner는 시스템 입력 장치로부터 읽는 scanner를 생성
        //생성된 scanner는 scanner 변수에 저장했다가 키보드에서 읽고 싶을 때 아래의 scanner.nextline() 메소드 실행
        String inputData;

        while(true) {
            inputData = scanner.nextLine();
            System.out.println("입력된 문자열: \"" + inputData + "\"");
            if(inputData.equals("q")) { // q가 입력되었는지 확인하는 코드
                break;
            }
        }
    System.out.println("종료");

    }
}
