package OopsConcept;

public class Bird extends Animal{
    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    public void Move() {
        System.out.println("Flapping wings...");
    }
}
