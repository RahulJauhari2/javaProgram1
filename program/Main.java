import java.lang.annotation.*;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Dog using Animal reference
        Animal myDog = new Dog();
        myDog.sound(); // This will call the overridden method in Dog class
    }
}
