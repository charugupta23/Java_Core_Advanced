package Collection;

import java.util.Stack;

public class StackExample {
    public static void main(String... args){
        Stack<Integer> s = new Stack<>();
        boolean result = s.empty();
        System.out.println(result);
        s.add(10);
        s.add(20);
        s.add(30);
        System.out.println("print stack = " + s);
        result = s.empty();
        System.out.println(result);
    }
}
