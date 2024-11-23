package Practice;

public class Button {
    OnClickListener listener; // 버튼을 누르면 리스너가 동작할 수 있게

    public void SetOnClickListener(OnClickListener listener){
        this.listener = listener;
    }

    public void Touch() {
        if(listener != null)
        listener.OnClick();

    }
}
