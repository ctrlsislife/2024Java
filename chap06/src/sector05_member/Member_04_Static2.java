package sector05_member;

public class Member_04_Static2 {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Member_03_Static.pi;
        int result2 = Member_03_Static.plus(10, 5);
        int result3 = Member_03_Static.minus(10, 5);

        System.out.println("result1 : "+result1);
        System.out.println("result2 : "+result2);
        System.out.println("result3 : "+result3);
    }
}
