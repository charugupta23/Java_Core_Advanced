package OopsConcept;

public abstract class Animal {
    int age;
    String gender;
    int weightInLbs;

    public Animal(int age, String gender, int weightInLbs){
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void Sleep(){
        System.out.println("Sleeping...");
    }
    public abstract void Move();
}
