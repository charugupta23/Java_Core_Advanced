package WhizLabs;


class Message {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

public class DateTime {
    public static void change(Message m) { //Line n5
        m = new Message(); //Line n6
        m.msg = "Happy Holidays!"; //Line n7
    }

    char var1;
    double var2;
    float var3;
            public static void main(String[] args) {

               /* DateTime obj = new DateTime();
                System.out.println(">" + obj.var1);
                System.out.println(">" + obj.var2);
                System.out.println(">" + obj.var3);
                String str1 = new String("Core");
                String str2 = new String("CoRe");
                System.out.println(str1 = str2);

                List<LocalDate> dates = new ArrayList<>();
                dates.add(LocalDate.parse("2018-07-11"));
                System.out.println(dates);
                dates.add(LocalDate.parse("1919-02-25"));
                System.out.println(dates);
                dates.add(LocalDate.of(2020, 4, 8));
                System.out.println(dates);
                dates.add(LocalDate.of(1980, Month.DECEMBER, 31));
                System.out.println(dates);

                dates.removeIf(x -> x.getYear() < 2000);

                System.out.println(dates);



               *//* LocalTime time = LocalTime.of(16, 40);
                String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM";
                System.out.println(amPm);*//*
               *//* Message obj = new Message(); //Line n1
                obj.print(); //Line n2
                change(obj); //Line n3
                obj.print(); //Line n4*//*

                *//*List<Integer> list = new ArrayList<>();
                list.add(100);
                list.add(200);
                list.add(100);
                list.add(200);
                list.remove(2);

                System.out.println(list);

                int a = 100;
                System.out.println(-a++);

                List<Character> list1 = new ArrayList<>();
                list1.add(0, 'V');
                list1.add('T');
                list1.add(1, 'E');
                list1.add(3, 'O');

                if(list.contains('O')) {
                    list.remove('O');
                }

                for(char ch : list1) {
                    System.out.print(ch);
                }

                LocalDateTime obj1 = LocalDateTime.now();
                System.out.println(obj1.getSecond());


                int [] arr = {2, 1, 0};
                for(int i : arr) {
                    System.out.println(arr[i]);
                }

                StringBuilder sb = new StringBuilder();
                //System.out.println(sb.append(null).length());


                Period period = Period.of(0, 0, 0);
                System.out.println(period);

                *//*

                List<String> list1 = new ArrayList<>();
                list1.add("A");
                list1.add("D");

                List<String> list2 = new ArrayList<>();
                list2.add("B");
                list2.add("C");

                list1.addAll(1, list2);

                System.out.println(list1);
*/
              /*  new Pen(); //Line 1
                Pen p = new Pen(); // Line 2
                change(p); //Line 3
                System.out.println("About to end."); //Line 4
*/

               /* LocalDate newYear = LocalDate.of(2018, 1, 1);
                LocalDate christmas = LocalDate.of(2018, 12, 25);
                boolean flag1 = newYear.isAfter(christmas);
                boolean flag2 = newYear.isBefore(christmas);
                System.out.println(flag1 + ":" + flag2);

                System.out.println("Output is: " + (10 != 5));
*/
                /*List<Integer> list = new ArrayList<>();
                list.add(100);
                list.add(200);
                list.add(100);
                list.add(200);
                list.remove(100);*/

               // System.out.println(list);

               /* StringBuilder sb = new StringBuilder("Java");
                String s1 = sb.toString();
                String s2 = sb.toString();

                System.out.println("value");
                System.out.println(s1 == s2);*/



            }
    public static void change(Pen pen) { //Line 5
        pen = new Pen(); //Line 6
    }
        }
class Pen {

}

interface Printable {
    public void setMargin();
    public void setOrientation();
}

abstract class Paper implements Printable { //Line 7
    public void setMargin() {}
    //Line 9
}

abstract class NewsPaper extends Paper { //Line 12
    public void setMargin() {}

    @Override
    public void setOrientation() {

    }
    //Line 14
}






                /*tringBuilder sb = new StringBuilder(100);
                System.out.println(sb.length() + ":" + sb.toString().length());
*/
        /*String s1 = "OCAJP";
        String s2 = "OCAJP" + "";
        System.out.println(s1 == s2);*/

       /* try {
            main(args);
        } catch (Exception ex) {
            System.out.println("Catch-");
        }
        System.out.println("Out");*/

       /* DateTimeFormatter f = DateTimeFormatter.ofPattern("MMDDYYYY");
        LocalDate bday =  null;
        try {
            bday = LocalDate.parse(args[0],f);
        }catch (java.time.DateTimeException e){

        }
        System.out.println(

        );*/

      /*  DateTimeFormatter dft = DateTimeFormatter.ofPattern("yy/mm/dd");
        LocalDateTime ldt = LocalDateTime.of(2015,10,10,11,22);

        System.out.println(dft.format(ldt));*/


