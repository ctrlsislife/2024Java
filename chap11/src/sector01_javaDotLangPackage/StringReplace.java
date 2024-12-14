package sector01_javaDotLangPackage;

public class StringReplace {
    public static void main(String[] args) {
        String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
        String newStr = oldStr.replace("자바", "JAVA");   // replace(옛것, 새것) 문자열 대체

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}

}
