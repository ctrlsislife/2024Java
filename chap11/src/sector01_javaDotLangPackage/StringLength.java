package sector01_javaDotLangPackage;

public class StringLength {
    public static void main(String[] args) {
        String ssn = "7306241230123";
        int length = ssn.length();
        if(length == 13) {  // length -> 문자열의 길이를 판독
            System.out.println("주민번호 자리수가 맞습니다.");
        } else {
            System.out.println("주민번호 자리수가 틀립니다.");
        }
    }
}


}
