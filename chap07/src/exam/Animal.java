package exam;

//public class Animal {
//    public boolean IsHealthy() {
//        return true; // 엉터리 코드지만 강제로 돌아가기 위해 만든 부분

public abstract class Animal {
    public abstract boolean IsHealthy();
    }
 // 실제로 구동되지 않으나 함수 바디 제시 없이 프로토타입만 제시해도 클래스가 되도록 함
// 추상 클래스는 동물병원의 animal처럼 animal이라는 객체가 동물병원에서 존재하지 않지만 다형성상 필요에 의해 만들어짐
