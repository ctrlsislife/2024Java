package ex05;

public class User {
    private Calculator calculator;
    private int value;

    User(String name){
        this.setName(name);
    }

    private void setName(String name) {
    }

    public void setCalculator(Calculator calculator, int i){
        this.calculator = calculator;
        this.value = value;

    }
    public void run() {
        calculator.setMemory(value);
    }

    public void start() {
        
    }
}
