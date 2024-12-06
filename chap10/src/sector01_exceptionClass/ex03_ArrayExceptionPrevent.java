package sector01_exceptionClass;

public class ex03_ArrayExceptionPrevent {
    public static void main(String[] args) {
        if(args.length == 2) {
            String data1 = args[0];
            String data2 = args[1];
            System.out.println("args[0]: " + data1);
            System.out.println("args[1]: " + data2);
        } else {
            System.out.println("두개의 실행 매개값이 필요합니다.");
        }
    }
}

// 배열을 읽어들이기 전에 길이를 먼저 조사하여 매개값이 없거나 넘어갈 경우 조건문을 통해 알려줌
