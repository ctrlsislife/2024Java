package sector03_Enumeration;

import java.util.Calendar;  // 캘린더 클래스 삽입

public class Enumeration_02_EnumWeek {
    public static void main(String[] args) {
        Week today = null;  // 열거 타입 변수 선언

        Calendar cal = Calendar.getInstance(); // 캘린더 실체화
        int week = cal.get(Calendar.DAY_OF_WEEK); // 일(1) ~ 토(7) 까지의 숫자

        switch(week) {
            case 1:
                today = Week.SUNDAY;
                break;

            case 2:
                today = Week.MONDAY;
                break;

            case 3:
                today = Week.TUESDAY;
                break;

            case 4:
                today = Week.WEDNESDAY;
                break;

            case 5:
                today = Week.THURSDAY;
                break;

            case 6:
                today = Week.FRIDAY;
                break;

            case 7:
                today = Week.SATURDAY;
                break; // 7까지 표현 완료

        }

        System.out.println(" 오늘은: " + today);

        // -- 이하 출력부
        if(today == Week.SUNDAY) {  // 오늘이 일요일이면
            System.out.println("일요일은 쉽니다.");
        } else {
            System.out.println("공부를 합니다.");
        }
    }
}
