package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String... args){
        Customer cust = new Customer(1,"a","1a");
        Customer cust1 = new Customer(2,"b","2b");
        Customer cust2 = new Customer(3,"c","3c");
        Customer cust3 = new Customer(3,"c","4c");

        HashSet<Customer> set = new HashSet<Customer>();
        set.add(cust);
        set.add(cust1);
        set.add(cust2);
        set.add(cust3);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        /*HashSet hs = new HashSet();
        boolean b1 = hs.add("ram");
        boolean b2 = hs.add("sita");
        boolean b3 = hs.add("ram");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(hs);*/
    }
}
