package OopsConcept;

public class Fish extends Animal{
    public Fish(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }
    public void Swim(){
        System.out.println("Swimming..");
    }

    public void Move() {
        System.out.println("Fish is swimming...");
    }
}
