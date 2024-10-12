package sector01_OperatorAndExpression;

public class Operation_03_IncreasedecreaseOperator {
    public static void main(String[] args) {
        // 증감 연산자 : ++, --
        // 변수의 값을 1 증가시키거나 1 감소 시키는 연산자
        // 불타입 제외 모든 기본 타입 피연산자에 사용 가능
        // 피연산자가 증감 연산자 뒤에 위치한 경우 : 다른 연산 수행 전에 피연산자의 값을 증감 시킴
        // 피연산자가 증감 연산자 앞에 위치한 경우 : 다른 연산을 수행 후 피연산자의 값을 증감 시킴

        int x = 10;
        int y = 10;
        int z;  // x , y 모두 10으로 시작

        System.out.println("---------------");
        x++; // 후위 증가 연산자 : 현재 x 값 사용 후 그 후에 1 증가시킴
        // 즉, x는 10에서 시작하므로 현재 x는 10으로 사용되고 그 후 1이 증가하여 11이 됨.
        ++x; // 전위 증가 연산자 : 먼저 1 증가시키고 그 값을 사용함
        // 즉, x가 이미 11이므로, 먼저 1을 더해서 12가 되고 그 값을 사용하여 12가 됨.
        System.out.println("x=" + x);


        System.out.println("---------------");
        y--; // 후위 감소 연산자 : 현재 y 값 사용 후 그 후에 1 감소시킴
        // 즉, y는 10에서 시작하므로 현재 y는 10으로 사용되고, 그 후 1이 감소하여 9가 됨.
        --y; // 전위 감소 연산자 : 먼저 1 감소시키고, 그 값을 사용함
        // 즉, y가 이미 9이므로, 먼저 1을 감소시켜 8이 되고 그 값을 사용하여 8이됨.
        System.out.println("y=" + y);

        System.out.println("---------------");
        z = x++; // 후위 증가 연산자 : x 값을 z에 대입한 후에 x를 1 증가시킴
        // x는 현재 12이고 후위 연산 수행하여 z는 12로 설정, 그 후 x가 13으로 증가함
        System.out.println("z=" + z); // 12
        System.out.println("x=" + x); // 13

        System.out.println("---------------");
        z = ++x; // 전위 증가 연산자 : 먼저 x를 1 증가시키고 그 값을 z에 대입
        // x는 현재 13이고 먼저 1을 증가시켜 14로 만들고 그 값을 z에 대입함
        System.out.println("z=" + z); //14
        System.out.println("x=" + x); //14

        System.out.println("---------------");
        z = ++x + y++; // 전위 증가 연산자 x , 후위 증가 연산자 y
        // ++x 연산 : x는 현재 14이고 먼저 1 증가시켜 15로 만들고 그 값을 사용
        // y++ 연산 : y는 현재 8이고 후위 연산이므로 8을 먼저 사용한 후 y를 9로 증가시킴
        // 따라서 z = 15 + 8 되어 z =23 이 되고, 이후 x는 15, y는 9가 됨
        System.out.println("z=" + z); //23
        System.out.println("x=" + x); // 15
        System.out.println("y=" + y); // 9
    }
}
