package sector01_exceptionClass;

public class ex05_ClassCastException {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat); // Cat 객체를 매개값으로 제공
    }

    public static void changeDog(Animal animal) {
        //if(animal instanceof Dog) {
        Dog dog = (Dog) animal; // dog타입 변환 불가 ClassCastException 발생
        //}
    }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

