package sector02_Array;

public class Reference_06_MainStringArrayArgs {
    public static void main(String[] args) {
        // psvm 명령어 실행시 JVM 에서 길이가 0인 String 배열을 생성하고 main() 함수 호출시 매개값으로 전달한다.
        if(args.length != 2) { // 입력 데이터 개수가 2개가 아니라면
            System.out.println("입력 값의 수가 부족합니다.");

            System.exit(0); // 프로그램 강제 종료
        }

        String strNum1 = args[0]; // 첫 번째 입력값 읽기
        String strNum2 = args[1]; // 두 번째 입력값 읽기

        int num1 = Integer.parseInt(strNum1); // 문자열을 정수형으로 변환
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        // 그냥 실행하면 입력 값의 수가 부족하다고 뜬다. 실행할 때 매개 값을 주지 않아 길이 0 배열이 그대로 매개값으로전달 된 것
        // 따라서 args.length가 0이므로 if 조건식이 true가 되어 if 블록이 실행되었음.
    }
}
