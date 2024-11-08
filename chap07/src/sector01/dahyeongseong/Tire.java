package sector01.dahyeongseong;

public class Tire {
    // field
    public int maxRotation; // 타이어의 수명을 뜻함
    public int accumulatedRotation; // 누적 회전수
    public String location; // 타이어의 위치

    // 생성자
    public Tire(String location, int maxRotation) {
        this.location = location; // 타이어의 위치 초기화
        this.maxRotation = maxRotation; //타이어 수명인 맥스 로테이션 초기화
    }

    // 메소드
    public boolean roll() {
        ++accumulatedRotation; // 누적 회전수 1증가
        if(accumulatedRotation > maxRotation) { // if 문은 정상 회전(누적 회전수< 최대 회전수)  경우 실행
            System.out.println(location + "타이어 수명: " + (maxRotation - accumulatedRotation) +"회");
            return true;
        } else { // else문은 마모한계 도달 (누적=최대) 경우 실행
            System.out.println("*** " + location + "Tire 손상 위험 ***");
            return false;
        }
    }
}
