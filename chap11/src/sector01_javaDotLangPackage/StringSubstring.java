package sector01_javaDotLangPackage;

public class StringSubstring {
    public static void main(String[] args) {
        String ssn = "880815-1234567 ";

        String firstNum = ssn.substring(0, 6);  // substring( 0 포함 ~ 6 제외 ) 사이의 문자열 추출
        System.out.println(firstNum);

        String secondNum = ssn.substring(7); // 7부터 끝까지
        System.out.println(secondNum);
    }
}


