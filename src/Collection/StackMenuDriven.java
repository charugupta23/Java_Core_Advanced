package Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackMenuDriven {
    public static void main(String... args) throws IOException {
        Stack<Integer> st = new Stack<>();
        int choice = 0;
        int position, element;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        while (choice < 4) {
            System.out.println("1: push an element");
            System.out.println("2: pop an element");
            System.out.println("3: search an element");
            System.out.println("4: EXIT");
            choice = Integer.parseInt(b.readLine());

            switch (choice) {
                case 1:
                    System.out.println("enter element");
                    element = Integer.parseInt(b.readLine());
                    st.push(element);
                    break;
                case 2:
                    Integer obj = st.pop();
                    System.out.println("popped element = " + obj);
                    break;
                case 3:
                    System.out.println("enter element to search");
                    element = Integer.parseInt(b.readLine());
                    position = st.search(element);

                    if (position == -1) {
                        System.out.println("No such element found in the stack");
                    } else {
                        System.out.println("position of element is = " + position);
                    }
                    break;
                default:
                    return;
            }
            System.out.println("stack elements = " + st);
        }
    }
}


