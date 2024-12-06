package sector01_exceptionClass;

public class ex04_NumberFormatException {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2); // a100을 숫자형으로 파싱할 수 없어 예외 발생

        int result = value1 + value2;
        System.out.println(data1 + "+" + data2 + "=" + result);
    }
}


