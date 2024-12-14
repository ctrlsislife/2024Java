import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

        public static void main(String[] args) {
            Map<Student, Integer> map = new HashMap<Student, Integer>();

            map.put(new Student(1, "홍길동"), 95);
            map.put(new Student(1, "홍길동"), 95);// 쌩으로는 2개의 인스턴스가 생성되지만

            System.out.println("총 Entry 수: " + map.size()); // 저장된 총 map.entry 수는 1개
        }
    }


