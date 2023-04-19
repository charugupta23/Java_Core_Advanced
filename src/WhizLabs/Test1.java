package WhizLabs;


public class Test1 {
    /*public String name;

    public Test1() {
        name = "james";
    }
*/
    public static void main(String... args) {
        /*Test1 obj = new Test1();
        System.out.println(obj.name);*/
      /*  List<StringBuilder> days = new ArrayList<>();
        days.add(new StringBuilder("Sunday"));
        days.add(new StringBuilder("Monday"));
        days.add(new StringBuilder("Tuesday"));
*/
       /* if(days.contains(new StringBuilder("Sunday"))) {
            days.add(new StringBuilder("Wednesday"));
        }

        System.out.println(days.size());

        System.out.println(new Boolean("FALSE"));
        System.out.println(Boolean.FALSE);

        List<String> list = new ArrayList<>();
        list.add(0, "Array");
        list.add(0, "List");
        if(list.contains("Array"))
        System.out.println(list);
*/
       /* int [] arr = {3, 2, 1};
        for(int i : arr) {
            System.out.println(arr[i]);
        }*/
        /*String msg = "Hello";
        boolean [] flag = new boolean[1];
        if(flag[0]) {
            msg = "Welcome";
        }
        System.out.println(msg);*/

       /* List<String> dryFruits = new ArrayList<>();
        dryFruits.add(new String("Walnut"));
        dryFruits.add(new String("Apricot"));
        dryFruits.add(new String("Almond"));
        dryFruits.add(new String("Date"));

        for(int i = 0; i < dryFruits.size(); i++)
        {
            if(i == 0) {
                dryFruits.remove(new String("Almond"));
            }
        }

        System.out.println(dryFruits);
    }*/


       /* List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(new Boolean("tRue"));
        list.add(new Boolean("abc"));

        if(list.remove(1)) {
            list.remove(1);
        }*/
       /* List<Integer> lis = new ArrayList<>();
        lis.add(110);
        lis.add(new Integer(110));
        lis.add(110);

        lis.removeIf(i -> i == 110);
        System.out.println(lis);
*/
        //int i = 1000;

        /*byte [] arr = new byte[0];
        System.out.println(arr[0]);*/
        /*List<String> trafficLight = new ArrayList<>();
        trafficLight.add(1, "RED");
        trafficLight.add(2, "ORANGE");
        trafficLight.add(3, "GREEN");

        trafficLight.remove(new Integer(2));

        System.out.println(trafficLight);*/

       /* List<StringBuilder> dryFruits = new ArrayList<>();
        dryFruits.add(new StringBuilder("Walnut"));
        dryFruits.add(new StringBuilder("Apricot"));
        dryFruits.add(new StringBuilder("Almond"));
        dryFruits.add(new StringBuilder("Date"));

        for(int i = 0; i < dryFruits.size(); i++)
        {
            if(i == 0) {
                dryFruits.remove(new StringBuilder("Almond"));
            }
        }

        System.out.println(dryFruits);
        LocalDate date = LocalDate.of(2020, 9, 6);
        System.out.println(date);
    }*/
       /* LocalDate joiningDate = LocalDate.parse("2006-03-16");
        System.out.println(joiningDate.withDayOfYear(29));*/

       /* LocalDate date = LocalDate.of(1987, 9, 1);
        String str = date.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date is: " + str);*/

       /* List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        students.remove(new Student("James", 25));

        for(Student stud : students) {
            System.out.println(stud);
        }*/

      /*  LocalDate date1 = LocalDate.parse("1947-08-15", DateTimeFormatter.ISO_DATE);
        LocalDate date2 = LocalDate.parse("1947-08-15",
                DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate date3 = LocalDate.of(1947, 8, 15);

        System.out.println(date1.equals(date2) + " : " + date2.equals(date3));


        String [] arr = {"abc", "TrUe", "false", null, "FALSE"};
        for(String s : arr) {
            System.out.print(Boolean.valueOf(s) ? "T" : "F");
        }

        add(10,10);
*/
      /*  System.out.println( 23 / 2.0);
        System.out.println( 23 % 2.0 );

        int a = 7;
        boolean res = a++ == 7 && ++a == 9 || a++ == 9;
        System.out.println("a = " + a);
        System.out.println("res = " + res);


        String fName = "James";
        String lName = "Gosling";
        System.out.println(fName = lName);*/
/*
        StringBuilder sb = new StringBuilder("Hello");
        List<StringBuilder> list = new ArrayList<>();
        list.add(sb);
        list.add(new StringBuilder("Hello"));
        list.add(sb);
        sb.append("World!");

        System.out.println(list);*/

        /*List<String> list = new ArrayList<>(4);
        list.add(0, "Array");

        list.add(3, "List");

        System.out.println(list);*/

        int i;
        outer:
        do {
            i = 5;
            inner:
            while (true) {
                System.out.println(i--);
                if (i == 4) {
                    break outer;
                }
            }
        } while (true);
    }

   /* private static void add(int i, int j) {
        System.out.println("int version");
    }*/

   /* private static void add(Integer i, Integer j) {
        System.out.println("Integer version");
    }*/

}

/*class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }

    public boolean equals(Student obj) {
        if(obj instanceof Student) {
            Student stud = (Student)obj;
            if(this.name.equals(stud.name) && this.age == stud.age) {
                return true;
            }
        }
        return false;
    }
}*/
/*class Base {
    public void m1() throws NullPointerException {
        System.out.println("Base: m1()");
    }
}*/

/*class Derived extends Base {
    public void m1() throws RuntimeException {
        System.out.println("Derived: m1()");
    }
}*/



