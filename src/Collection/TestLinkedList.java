package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String... args){
        LinkedList<String> li = new LinkedList<String>();
        li.add("ram");
        li.add("puja");
        li.add("umika");

        LinkedList<String> li1 = new LinkedList<>();
        li1.add("Amit");
        li1.add("Amar");
        li.addAll(li1);
        li.addFirst("Java");
        li.addLast("Class");
        li.add(2,"sita");
        Iterator i = li.iterator();
        //Iterator i = li.descendingIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
