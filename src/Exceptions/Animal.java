package Exceptions;

import java.io.IOException;

public class Animal {
    public void eat() throws IOException{
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("Dog eats");
    }

    public static void main(String... args) throws IOException {
        Animal a = new Dog();
        Dog d = new Dog();
        d.eat();
        a.eat();



    }
}
