package sector02_PrimitiveType;

public class Integer_08_Boolean_Type {
    public static void main(String[] args) {
        boolean stop = true;   // stop 변수에 true 값 부여
        if(stop) {    // stop이 true 값 가진다면 if 블록, 그외는 else 블록이 실행됨
            System.out.println("중지합니다.");
        }
        else {
            System.out.println("시작합니다.");
        }
    }
}
