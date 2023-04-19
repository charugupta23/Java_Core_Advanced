public class Overriding {
    void show(){
        System.out.println("Base class");
    }
}

class Child extends  Overriding{
    public void show(){
        System.out.println("Child class");
        //super.show();
    }

    public static void main(String[] args){
        Child c = new Child();
        c.show();
    }
}
