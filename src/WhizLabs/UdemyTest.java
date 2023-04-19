package WhizLabs;

import java.util.ArrayList;
import java.util.List;

public class UdemyTest {

       /* public static void main(String[] args) {
            byte var = 100;
            switch(var) {
                case 100:
                    System.out.println("var is 100");
                    break;
                case 200:
                    System.out.println("var is 200");
                    break;
                case 300:
                    System.out.println("var is 200");
                    break;
                default:
                    System.out.println("In default");
            }
        }*/


        private String name;
        private int age;

    UdemyTest(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return "Student[" + name + ", " + age + "]";
        }



        public static void main(String[] args) {
            List<UdemyTest> students = new ArrayList<>();
            students.add(new UdemyTest("James", 25));
            students.add(new UdemyTest("James", 27));
            students.add(new UdemyTest("James", 25));
            students.add(new UdemyTest("James", 25));

            students.remove(new UdemyTest("James", 25));

            for(UdemyTest stud : students) {
                System.out.println(stud);
            }
        }
    }

