package sector02_exceptionPrevent;

public class ex02_TryCatchByRuntimeError {
    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;
        try {
            data1 = args[0];  // 실행 매개값을 주지 않아 8라인에서 예외 발생
            data2 = args[1];
        } catch(ArrayIndexOutOfBoundsException e) { // 잡혀서 10~12 라인 실행
            System.out.println("실행 매개값의 수가 부족합니다.");
            return;
        }

        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch(NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } finally {
            System.out.println("다시 실행하세요.");
        }
    }
}

