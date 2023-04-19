package WhizLabs;

import java.io.IOException;

/*class animal {
    public void eat() throws NullPointerException{
        System.out.println("Animal eats");
    }
}

class dog extends animal{
    void eat(String s)throws Exception{
        System.out.println("Dog eats " + s);
    }
}*/
public class Whizlab {

    public static void main(String... args) throws IOException,ClassNotFoundException {
        new Whizlab().doit();
        new Whizlab().didit();
    }

    public static void doit() throws java.io.IOException{
        throw new IOException();
    }

    public static void didit() throws ClassNotFoundException{
        throw new SecurityException();
    }


    /*static String o = "";
    static  int x=1;*/

  /*  public static void main(String[] args) throws Exception{

        int ints[][] ={{1,2},{3,5},{6,7},{8,9}};
        for (int x=0; x< ints.length;x++){
            for (int y : ints[x]){
                System.out.println(y);
            }
        }

        int a = -10;
        System.out.println(a%(-3));
        System.out.println(a%(3));*/


        /*int a=1;
        while(a<=3){
            if(a++ == 2)
                continue;
            System.out.println(a+"");*/
       /* System.out.println((int)(Math.random()*6)+1);
        }*/
        /*animal a = new dog();
        dog d = (dog)a;
        a.eat();
        d.eat("meat");
*/
        /*int y = 0;
        while(y--<10){
            //System.out.println(y);
                continue;
        }
        String message = y>10?"Greater Than":"Less Than";
        System.out.println(message + "10");
*/
       /* z:
        for (int x = 3; x < 8; x++) {
            if (x == 4)
                continue;
            if (x == 4)
                break z;
            o += x;
        }
        System.out.println(o);*/

       /* int[] nums = {0,1,2,3,4};
        for(int x:nums){
            System.out.println(x);
            continue;
            System.out.println(x+Whiz.x);
        }*/

       /* int x=20;
        while(x>0){
            do {
                x -= 2;
            }while (x>5);
                x--;
            System.out.println(x);
        }*/

        /*do{
            int i=1;
            System.out.println(i++ +"");
        }while (i<=5);*/

        /*final int x=0;
        final int y=2;
        switch (x+y){
            case x:{
                System.out.println("A");}
            case 1:
                System.out.println("B");
            default:
                System.out.println("default"); break;
            case y:
                System.out.println("C");
        }*/

        /*final int x;
        x=0;
        final int y=2;
        switch (x){
            case x :{
                System.out.println("A");

        }*/

}

