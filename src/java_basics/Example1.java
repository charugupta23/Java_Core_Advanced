package java_basics;

public class Example1 {
    Example1(float a, float b){
        System.out.println("float = " +(a+b));
    }
    Example1(Integer a, Integer b){
        System.out.println("Integer = " +(a+b));
    }
    Example1(double a, double b){
        System.out.println("double = " +(a+b));
    }
   /* Example1(int a, int b){
        System.out.println("int = " +(a+b));
    }*/
    public static void main(String... args){
        new Example1(1,2);
        new Example1(2.0,3.0);
    }
}
