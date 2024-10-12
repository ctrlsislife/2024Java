package sector02_Array;

public class Reference_04_ArrayCreateByNew {
    public static void main(String[] args) {
        // new 연산자로 배열 객체를 생성하는법
        // 타입[] 변수 = new 타입[길이]

        // 배열 생성 후 특정 인덱스 위치에 새로운 값을 저장하는법
        // 변수[인덱스] = 값;

        int[] arr1 = new int[3]; // int 배열 생성
        for(int i=0; i<3; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }
        arr1[0] = 10; // int 배열으 ㅣ인덱스에 값 저장
        arr1[1] = 20;
        arr1[2] = 30;
        for(int i=0; i<3; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }



        double[] arr2 = new double[3]; // double 배열 생성
        for(int i=0; i<3; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
        arr2[0] = 0.1; // double 배열의 인덱스에 값 저장
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        for(int i=0; i<3; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }



        String[] arr3 = new String[3]; // String 배열 생성
        for(int i=0; i<3; i++) {
            System.out.println("arr3[" + i + "] = " + arr3[i]);
        }
        arr3[0] = "1월"; // String 인덱스에 값 저장
        arr3[1] = "2월";
        arr3[2] = "3월";
        for(int i=0; i<3; i++) {
            System.out.println("arr3[" + i + "] = " + arr3[i]);
        }
    }
}
