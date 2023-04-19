package java_basics;

import java.util.Scanner;

public class Hello {

    public void helloName(){
        System.out.println("Hello\n" + "Charu");
    }

    public void addTwoNum(){
        int a = 74;
        int b = 36;
        System.out.println("SUM = "+ (a+b));
    }

    public void divideTwoNum(){
        int a = 74;
        int b = 36;
        System.out.println("DIVISION = "+ (a/b));
    }

    public void printOutput(){
        System.out.println("a = " +( -5 + 8 * 6));
        System.out.println("b = " +((55+9) % 9));
        System.out.println("c = " +(20 + -3*5 / 8));
        System.out.println("d = " +(5 + 15 / 3 * 2 - 8 % 3));
    }

    public void takesTwoNum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Print 1st no. :");
        int num1 = in.nextInt();

        System.out.println("Print 2st no. :");
        int num2 = in.nextInt();

        System.out.println("Multiplication of num1 and num2 : " + (num1*num2));
    }

    public void performOperation(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st no. : ");
        int num1 = in.nextInt();
        System.out.println("enter 2st no. : ");
        int num2 = in.nextInt();

        System.out.println("Expected Output : ");
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 % num2);

    }

    public void multiplicationTable(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter No : ");
        int num = in.nextInt();

        for (int i= 1; i<=10 ; ++i) {
            System.out.println(num + " + " + i + " = " + i*num);
        }
    }

    public void printJava(){
        System.out.println("    J    a   v     v  a ");
        System.out.println("    J   a a   v   v  a a");
        System.out.println("J   J  aaaaa   V V  aaaaa ");
        System.out.println("  JJ  a     a   V  a     a");
    }

    public void printExpression(){
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }

    public void printExpression2(){
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
    }

    public void area_perimeter_Circle(){
        final double radius = 7.5;
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);
    }

    public void calculate_Average(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int First_Number = in.nextInt();
        System.out.println("Enter 2st Number : ");
        int Second_Number = in.nextInt();
        System.out.println("Enter 3st Number : ");
        int Third_Number = in.nextInt();
        double calculate_Average = (First_Number + Second_Number + Third_Number)/3;
        System.out.println("Average : " + (First_Number + Second_Number + Third_Number)/3);
    }

    public void area_perimeter_Ractangle(){
        final double width = 5.5;
        final double height = 8.5;
        double area = height * width;
        double perimeter = 2 * (height + width);
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
    }

    public void swap_variables(){
        int First_Var = 5;
        int Second_Var = 10;
        int c;
        System.out.println("First_Var : " + First_Var +"\n" + "Second_Var : " + Second_Var);
        c=First_Var;
        First_Var=Second_Var;
        Second_Var=c;

        System.out.println("Sawp Variable Fisrt_var and Seccod_Var respectively :" +
                First_Var + " , " + Second_Var);
    }

    public void compare_two_num(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = in.nextInt();;
        System.out.println("Enter Second Number : ");
        int num2 = in.nextInt();
        if(num1==num2){
            System.out.printf( "%d == %d\n", num1, num2 );
        }
        if(num1!=num2){
            System.out.printf( "%d != %d\n", num1, num2 );
        }
        if(num1>num2) {
            System.out.printf("%d > %d\n", num1, num2);
        }
        if(num1<num2) {
            System.out.printf("%d < %d\n", num1, num2);
        }
        if(num1>=num2) {
            System.out.printf("%d >= %d\n", num1, num2);
        }
        if(num1<=num2) {
            System.out.printf("%d <= %d\n", num1, num2);
        }
    }

    public void sum_ofthe_digits(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the digit :");
        long num = in.nextLong();
        int sum = calculateSum(num);
        System.out.println("Sum of digits : " +  sum);
    }
    public int calculateSum(long num){
        int sum =0;
        while (num!=0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public void area_0f_hexagon(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of hexagon : ");
        int length = in.nextInt();
        double area = (6 * (length*length))/(4* Math.tan(Math.PI/6));
        System.out.println("Area of Hexagon : " + area);
    }

    public void area_of_polygon(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of sides of polygon : ");
        int num_of_sides = in.nextInt();
        System.out.println("Enter ther length of the side : ");
        int length_of_side = in.nextInt();
        double area = (num_of_sides*(length_of_side*length_of_side))/(4*Math.tan(Math.PI/num_of_sides));
        System.out.println("Area of polygon : "+area);
    }

    public void cal_distance_between_twopointsof_earth(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter latx1 : ");
        double lat1 = in.nextLong();
        lat1 = Math.toRadians(lat1);
        System.out.println("Enter lony1 : ");
        long lon1 = in.nextLong();
        System.out.println("Enter latx2 : ");
        long lat2 = in.nextLong();
        System.out.println("Enter lony2 : ");
        long lon2 = in.nextLong();
    }

    //static  Integer I;
    /*String s;
        try {
            s=I.toString();
        }finally {
            try {
                int i = Integer.parseInt(args[10]);
            }catch (NumberFormatException E){
                System.out.println("NumberFormat");
            }finally {
                System.out.println("Fin2");
            }
            System.out.println("Fin1");
        }*/
       //Hello a = new Hello();
       //a.helloName();
       // a.addTwoNum();
       // a.divideTwoNum();
        //a.printOutput();
        //a.takesTwoNum();
        //a.performOperation();
        //a.multiplicationTable();
        //a.printJava();
        //a.printExpression();
        //a.printExpression2();
        //a.area_perimeter_Circle();
        //a.calculate_Average();
        //a.area_perimeter_Ractangle();
        //skiped 14th program
        //a.swap_variables();
        //a.compare_two_num();
        //a.sum_ofthe_digits();
        //a.area_0f_hexagon();
        //a.area_of_polygon();
    }

