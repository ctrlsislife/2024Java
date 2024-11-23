package sector04_MobileUIButton;

    // Button 클래스 정의
    public class Button {
        OnClickListener listener; // 클릭 이벤트를 처리하기 위한 인터페이스 타입의 필드

        // 클릭 리스너를 설정하는 메서드
        void setOnClickListener(OnClickListener listener) {
            this.listener = listener; // 전달받은 리스너 객체를 필드에 저장
        }

        // 버튼이 클릭되었을 때 호출되는 메서드
        void touch() {
            listener.onClick(); // 설정된 리스너의 onClick 메서드를 호출
        }

        // 내부 인터페이스 정의
        static interface OnClickListener {
            void onClick(); // 버튼 클릭 시 실행될 동작을 정의하는 추상 메서드
        }
    }

}
