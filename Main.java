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

    void makeSound() {
        System.out.println(sound);
    }
}

class Dog extends Animal {
    Dog() {
        sound = "bark";
    }
}

class DogFood {

}


