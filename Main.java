import java.lang.annotation.Native;

public class Main {

    public static void main(String[] args) {
        Object[] list = {new Dog(), new DogFood()};
        for (Object object: list) {
            if (object instanceof Animal) {
                ((Animal) object).makeSound();
            }
        }
    }
}

class Animal {
    String sound = "";

    Animal(String sound) {
        this.sound = sound;
    }

    void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": sound = " + sound;
    }
}

class Dog extends Animal {
    Dog() {
        super("bark");
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("*wags tails");
    }
}

class DogFood {

}


