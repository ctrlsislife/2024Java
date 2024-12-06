package sector01_exceptionClass;

public class ex01_NullPointerException {
    public static void main(String[] args) {
        String data = null;
        System.out.println(data.toString()); // data가 없는데 toString을 시도해 널 포인트 액셉션 발생
    }
}

