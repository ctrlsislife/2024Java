
package sector06_AccessAvailable;

public class AccessAvailable_03_GetterSetter {
        // 세터 : 메소드를 통해 유효한 값만 객체의 필드로 저장할 수 있게 해줌
        // 게더 : 외부에서 객체의 데이터를 읽을때 필드값을 적절히 알아볼 수 잇게 가공한 후 외부로 전달하기 위한 메소드
        private int speed;
        private boolean stop;

        // method
        public int getSpeed() {
            return speed;
        }
        public void setSpeed(int speed) {
            if(speed < 0){
                this.speed = 0;
                return;
            }else {
                this.speed = speed;
            }
        }

        public boolean isStop() {
            return stop;
        }
        public void setStop(boolean stop) {
            this.stop = stop;
            this.speed=0;
        }
    }



