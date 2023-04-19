/*public class Foo {
    static void alpha(){
        System.out.println("alpha");

    }
    void beta(){
        alpha();
        System.out.println("beta");
    }

    public static void main(){
        Foo.alpha();

    }*/


/*public class Test {
        public static void main(String [] args) {
           *//* LocalDate newYear = LocalDate.of(2018, 1, 1);
            LocalDate christmas = LocalDate.of(2018, 12, 25);
            boolean flag1 = newYear.isAfter(christmas);
            boolean flag2 = newYear.isBefore(christmas);
            System.out.println(flag1 + ":" + flag2);*//*

            *//*double [] arr = new int[2]; //Line 3
            System.out.println(arr[0]); //Line 4*//*

            String[] names = { "Smith", "Brown", "Thomas", "Taylor", "Jones" };
            List<String> list = new ArrayList<>();
            for (int x = 0; x < names.length; x++) {
                list.add(names[x]);
                switch (x) {
                    case 2:
                        continue;
                }
                break;
            }
            System.out.println(list.size());

        }
    }*/

/*abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String breed;
    Dog(String breed) {
        this.breed = breed;
    }

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Beagle");
        Dog dog2 = new Dog("Bubbly", "Poodle");
        System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" +
                dog2.getName() + ":" + dog2.getBreed());
    }
}*/

/*
public class Test {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 40);
        String amPm = time.getHour() >= 12 || (time.getHour() == 12) ? "PM" : "AM";
        System.out.println(amPm);
    }

}
*/
/*
public class Test {
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        Iterator<String> iterator = dryFruits.iterator();
        while(iterator.hasNext()) {
            String dryFruit = iterator.next();
            if(dryFruit.startsWith("A")) {
                dryFruits.remove(dryFruit);
            }
        }

        System.out.println(dryFruits);
    }
}*/

/*public class Test {
    public static void main(String[] args) {
        int [] arr = {2, 1, 0};
        for(int i : arr) {
            System.out.println(arr[i]);
        }
    }
}*/

/*public class Test {
    public static void main(String [] args) {
        Period period = Period.of(0, 0, 0);
        System.out.println(period);
    }
}*/

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Test {
    public static void main(String[] args) {
        Student student = new Student("James", 25);
        int marks = 25;
        review(student, marks);
        System.out.println(marks + "-" + student.marks);
    }

    private static void review(Student stud, int marks) {
        marks = marks + 10;
        stud.marks+=marks;
    }
}

