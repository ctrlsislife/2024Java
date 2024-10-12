package sector01_Variable;

public class Variable_02_Use {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간 " + minute + "분");

        int totalMinute =  (hour*60) + minute;
        // 시간을 분으로만 표현하기 위해 totalMinute 변수 생성하여 hour*60 + minute 취함
        System.out.println("총 " + totalMinute + "분");
    }
    // 변수는 출력문이나 연산식 내부에서 변수에 저장된 값을 출력하거나 연산시 사용
}
