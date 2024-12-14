import java.util.List;

import java.util.*;

    public class ArrayList{
        public static void main(String[] args) {
            List<String> list = new java.util.ArrayList<String>();

            list.add("Java");  // String 저장
            list.add("JDBC");
            list.add("Servlet/JSP");
            list.add(2, "Database");
            list.add("iBATIS");

            int size = list.size();  // size-> 저장된 총 객체 수 얻기
            System.out.println("총 객체수: " + size);
            System.out.println();

            String skill = list.get(2);    // 2번 인덱스의 객체 얻기
            System.out.println("2: " + skill);
            System.out.println();

            for(int i=0; i<list.size(); i++) {  // 저장된 객체 수 만큼 나열
                String str = list.get(i);
                System.out.println(i + ":" + str);
            }
            System.out.println();

            list.remove(2);  // 인덱스 제거
            list.remove(2);
            list.remove("iBATIS");

            for(int i=0; i<list.size(); i++) {  // 제거 후 저장된 객체 수 만큼 나열
                String str = list.get(i);
                System.out.println(i + ":" + str);
            }
        }
    }

}
