import java.util.Iterator;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> set = new java.util.HashSet<String>();

        set.add("Java"); // Java 2개지만 1개만 저장됨
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");
        // hashSet에 의해 string 단위서 content가 같으면 같다고 판단
        // 리터럴 같다 -> 하나만 생성



        int size = set.size(); // 저장된 객체수 얻기
        System.out.println("총 객체수: " + size);

        Iterator<String> iterator = set.iterator(); // 반복자 얻기
        while(iterator.hasNext()) { // 객체 수 만큼 나열
            String element = iterator.next(); // 객체 수 가져오기
            System.out.println("\t" + element);
        }

        set.remove("JDBC"); // 객체 삭제
        set.remove("iBATIS");

        System.out.println("총 객체수: " + set.size());

        for(String element : set) {
            System.out.println("\t" + element);
        }

        set.clear(); // 모든 객체 제거
        if(set.isEmpty()) { System.out.println("비어 있음"); }
    }
}


