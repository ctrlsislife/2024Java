package sector01_Variable;

public class Variable_03_Exchange {
    public static void main(String[] args) {

        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ". y:" + y);


        //temp : temporary (교환을 위해 임시로 만든 변수)
        int temp = x; // 변수 x 값 3을 변수 temp 에 저장
        x = y;        // 변수 y 값 5를 변수 x에 저장
        y = temp;     // 변수 temp값 3을 변수 y에 저장
        System.out.println("x:" + x + ". y:" + y);
    }
}
