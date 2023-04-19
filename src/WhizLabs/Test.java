package WhizLabs;

/*
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
*/

public class Test {
    public static void main(String[] args) {
       /* Student student = new Student("James", 25);
        int marks = 25;
        review(student, marks);
        System.out.println(marks + "-" + student.marks);
  */
        /*
        String [] arr = {"I", "N", "S", "E", "R", "T"};
        for(int n = 1; n <= arr.length; n += 2) {
            if (n % 2 == 0) {
                continue;
            }
            System.out.print(arr[n]); //Line n1
        }*/
        /* LocalDate date = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;
        System.out.println(date.atTime(time));*/
        /*String str = "java";
        StringBuilder sb = new StringBuilder("java");

        System.out.println(str.equals(sb) + ":" + sb.equals(str));*/
       /* List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(2));
        list.add(new Integer(1));
        list.add(new Integer(0));

        list.remove(list.indexOf(0));

        System.out.println(list);*/
        /* String str1 = new String("Core");
        String str2 = new String("CoRe");
        System.out.println(str1 = str2);*/
        /*double price = 90000;
        String model;
        if(price > 100000) {
            model = "Tesla Model X";
        } else if(price <= 100000) {
            model = "Tesla Model S";
        }
        System.out.println(model);*/
        /*Double [] arr = new Double[2];
        System.out.println(arr[0] + arr[1]);*/
        /* ArrayList<Counter> original = new ArrayList<>();
        original.add(new Counter(10));

        ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone();
        cloned.get(0).count = 5;

        System.out.println(original);*/
        /*LocalTime time = LocalTime.of(16, 40);
        String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM";
        System.out.println(amPm);*/
        /*List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

*/
        /*int grade = 60;
        if(grade = 60)
            System.out.println("You passed...");
        else
            System.out.println("You failed...");
             System.out.println(dryFruits);
*/
        /*Boolean b1 = new Boolean("tRuE");
        Boolean b2 = new Boolean("fAlSe");
        Boolean b3 = new Boolean("abc");
        Boolean b4 = null;
        System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4);
*/
       /* LocalDate date = LocalDate.parse("2000-01-01");
        Period period = Period.ofYears(-3000);
        System.out.println(date.plus(period));
*/
        /*int [] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String str = process(arr, 3, 8); //Line 5
        System.out.println(str);
*/
        /*List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("THREE");
        list.remove(3);

*/
       /* List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.remove(0) + ":" + list.remove(null));
        System.out.println(list);
*/
        /*System.out.println(args.length);

        StringBuilder sb = new StringBuilder("Hurrah! I Passed...");
        sb.delete(0,100);
        System.out.println(sb.length());

        m1(null);
*/
        /*int a = 2;
        boolean res = false;
        if(a++ == 2)
        {
            System.out.println(a);
        }
        if(--a == 2)
        {
            System.out.println(a);
        }
        if(--a == 2)*/
        /*{
            System.out.println(a);
        }*/
        //res = a++ == 2 || --a == 2 && --a == 2;
        //System.out.println(a);

        /*String fruit = "mango";
        switch (fruit) {
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
            default:
                System.out.println("ANY FRUIT WILL DO");
        }*/
/*
        String [] arr = new String[7];
        System.out.println(arr);*/

       /* Message1 obj = new Message1(); //Line n1
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4
*/
        //System.out.println(!flag ? args[0] : args[1]);


        String[][] arr = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };
        for (int i = 0; i < arr.length; i++) { //Line n1
            for (int j = 0; j < arr[i].length; j++) { //Line n2
                switch (arr[i][j]) { //Line n3
                    case "2":
                    case "4":
                    case "6":
                        break; //Line n4
                    default:
                        continue; //Line n5
                }
                System.out.print(arr[i][j]); //Line n6
            }
        }

        Test obj = new Test();
        System.out.println(obj.name);
    }
   // private static boolean flag = !true;


    /*static void m1(CharSequence s) {
        System.out.println("CharSequence");
    }

    static void m1(String s) {
        System.out.println("String");
    }

    static void m1(Object s) {
        System.out.println("Object");
    }*/

    public String name;
    public void Test() {
        name = "James";
    }
}
class Message1 {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}


