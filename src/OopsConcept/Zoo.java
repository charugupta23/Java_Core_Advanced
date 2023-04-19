package OopsConcept;

public class Zoo {
    public static void main(String[] args){
        Sparrow sparrow1 = new Sparrow(1,"M", 10);
        //sparrow1.Move();
        MoveAnimal(sparrow1);

        Fish fish1 = new Fish(1, "F", 2);
        //fish1.Move();
        MoveAnimal(fish1);
    }

    public static void MoveAnimal(Animal animal){
        animal.Move();
    }
}
