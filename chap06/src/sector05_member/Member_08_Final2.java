package sector05_member;

public class Member_08_Final2 {
    public static void main(String[] args) {
        Member_07_Final p1 = new Member_07_Final("123456-1234567","홍길동");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        p1.name = "홍삼원";
    }
}
