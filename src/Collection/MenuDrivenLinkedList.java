package Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class MenuDrivenLinkedList {
    public static void main(String... args) throws IOException {
        LinkedList<String> li = new LinkedList<String>();
        li.add("America");
        li.add("India");
        li.add("Japan");

        System.out.println("List = " + li);
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        String element;
        int position, choice =0;
        while(choice<4)
        {
            System.out.println("\n Linked list Operation..");
            System.out.println(" 1 add an element..");
            System.out.println(" 2 remove an element..");
            System.out.println(" 3 change an element..");
            System.out.println(" 4 Exit an element..");
            System.out.println("enter your choice");

            choice = Integer.parseInt(b.readLine());

            switch (choice){
                case 1 :
                    System.out.println("Enter element ");
                    element = b.readLine();
                    System.out.println("enter the position ");
                    position = Integer.parseInt(b.readLine());
                    li.add(position-1, element);
                    break;
                case 2:
                    System.out.println("enter position ");
                    position = Integer.parseInt(b.readLine());
                    li.remove(position-1);
                    break;
                default:
                    return;
            }
            System.out.println("List = " +li);
            Iterator i = li.iterator();
            while (i.hasNext()){
                System.out.println(i.next() + " ");
            }
        }

    }
}
