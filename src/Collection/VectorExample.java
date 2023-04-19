package Collection;

import java.util.Vector;

public class VectorExample {
    public static void main(String... args){
        Vector<String> v = new Vector<>();
        v.add("ram");
        v.add("sita");
        v.add("umika");
        v.add("ramesh");
        System.out.println("elements are = "+ v);
        System.out.println("Size = " + v.size());
        v.add("sachin");
        v.add("anil");
        /*v.add("sachin");
        v.add("anil");
        v.add("sachin");
        v.add("anil");
        v.add("sachin");
        v.add("anil");*/
        if(v.contains("umika")){
            System.out.println("umika at the index of = " + v.indexOf("umika"));
        }else {
            System.out.println("umika is not present in vector");
            System.out.println(v);
        }
        System.out.println("capacity after addition = " + v.capacity());
    }

}
