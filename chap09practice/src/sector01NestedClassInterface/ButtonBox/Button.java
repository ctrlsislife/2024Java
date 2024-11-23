package sector01NestedClassInterface.ButtonBox;


    public class Button {
        OnClickListener listener; // 인터페이스 타입 필드

        void setOnClickListener(OnClickListener listener) {
            this.listener = listener; // 리스너 설정
        }

        void touch() {
            listener.onClick(); // 리스너의 onClick 메서드 호출
        }

        static interface OnClickListener {
            void onClick(); // 버튼 클릭 시 동작 정의
        }
    }




