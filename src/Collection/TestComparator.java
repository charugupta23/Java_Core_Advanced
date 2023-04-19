package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class user{
    int uid;
    String uname;
    int age;

    public user(int uid, String uname, int age) {
        this.uid = uid;
        this.uname = uname;
        this.age = age;
    }
}

public class TestComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        user u1 = (user) o1;
        user u2 = (user) o2;
        if (u1.age == u2.age)
            return 0;
        else if (u1.age > u2.age)
            return 1;
        else
            return -1;
    }
}

class Main{
    public  static void main(String... args){
        ArrayList al = new ArrayList();
        al.add(new user(101,"ram",30));
        al.add(new user(104,"ajay",25));
        al.add(new user(107,"vijay",27));
        System.out.println("sorting by age");
        Collections.sort(al, new TestComparator());
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            user u = (user)itr.next();
            System.out.println(u.uid+" "+u.uname+" "+ u.age);
        }
    }
}
