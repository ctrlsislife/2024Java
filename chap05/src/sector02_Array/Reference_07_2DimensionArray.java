package sector02_Array;

public class Reference_07_2DimensionArray {
    public static void main(String[] args) {
        // 여태의 배열은 값 목록으로만 구성된 1차원 배열임
        // 아래는 행과 열로써 구성된 2차원 배열이기에 가로 인덱스와 세로 인덱스를 사용한다.

        int[][] mathScores = new int[2][3]; // 2x3 의 배열 생성 ( 총 6개의 값)
        for(int i =0; i<mathScores.length;i++){
            for(int j =0; j<mathScores[i].length; j++){
                System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
            }
        }
        System.out.println();

        int[][] englishScores = new int[2][]; // 행의 개수는 2로 초기화, 열의 개수는 미정
        englishScores[0] = new int[2]; // 첫번째 배열[0] : 2개의 요소를 가지는 배열로 초기화
        englishScores[1] = new int[3]; // 두번째 배열[1] : 3개의 요소를 가지는 배열로 초기화
        for(int i =0; i<englishScores.length;i++){
            for(int j =0; j<englishScores[i].length; j++){
                System.out.println("englishScores[" + i + "][" + j + "] = " + englishScores[i][j]); // 행열의 길이가 다른 계단식 배열 나옴
            }
        }
        System.out.println();

        int[][] gameScores = { {95, 80}, {92, 96, 80} }; // 배열의 각 행 열을 직접 초기화 하는 방법
        // 첫 째행 : 95, 80 가짐 / 둘째 행 : 92. 96, 80 가짐
        for(int i =0; i<gameScores.length;i++){
            for(int j =0; j<gameScores[i].length; j++){
                System.out.println("gameScores[" + i + "][" + j + "] = " + gameScores[i][j]);
            }
        }
    }
}
