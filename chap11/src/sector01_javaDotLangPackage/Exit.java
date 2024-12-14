package sector01_javaDotLangPackage;

public class Exit {
    public static void main(String[] args)  {
        for(int i=0; i<10; i++) {
            if(i == 5) {
                System.exit(i);  // 프로그램을 강제종료하는 역할 -> 만약 11라인의 실행이 필요하다면 아래의 break 사용해야함
                //break;
            }
        }
        System.out.println("마무리 코드");
    }
}


}
