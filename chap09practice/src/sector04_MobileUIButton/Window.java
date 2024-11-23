package sector04_MobileUIButton;

    // Window 클래스 정의
    public class Window {
        Button button1 = new Button(); // 첫 번째 버튼 객체 생성
        Button button2 = new Button(); // 두 번째 버튼 객체 생성

        // 필드 초기값으로 OnClickListener 인터페이스 구현
        Button.OnClickListener listener = new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("전화를 겁니다."); // 버튼1 클릭 시 동작
            }
        };

        // 생성자에서 버튼 클릭 리스너 설정
        Window() {
            button1.setOnClickListener(listener); // 버튼1의 클릭 리스너 설정

            // 익명 객체를 사용해 버튼2의 클릭 리스너 설정
            button2.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick() {
                    System.out.println("메시지를 보냅니다."); // 버튼2 클릭 시 동작
                }
            });
        }
    }


