package sector01.AbstractMethod;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Snake snake = new Snake();
        dog.sound();
        snake.sound();
        System.out.println("-------");

        // 변수간 자동 타입 변환
        Animal animal = null;
        animal = new Dog();
        animal.sound();

        animal = new Snake();
        animal.sound();
        System.out.println("-------");

        // 메소드의 다형성
        animalSound(new Dog());
        animalSound(new Snake());
    }

    public static void animalSound(Animal animal) { // 자동 타입 변환
        animal.sound(); // 재정의된 메소드 호출
    }
}
