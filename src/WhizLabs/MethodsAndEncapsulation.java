package WhizLabs;

public class MethodsAndEncapsulation {
    static int x=1;

    MethodsAndEncapsulation(){
        x++;
        System.out.println("x constructor = " + x);
    }
    public static void main(String... args){
        System.out.println(x+check(2));
    }

    static int check(int it){
        System.out.println("x = " + x);
        System.out.println("it = " + it);
            return new MethodsAndEncapsulation().x*it;
    }
}
