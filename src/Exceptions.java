/*
public class Exceptions {

        public static void main(String[] args) {
            try {
                if (args.length == 0) return;
                System.out.println(args[0]);
            } finally {
                System.out.println("The end");
            }
        }
}
*/
/*
public class Exceptions {
    void cal() throws  Exception{
        int x = 100/0;
    }
    void  calSize() throws IndexOutOfBoundsException{
        int a[] = new int[5];
        a[10] =8;
    }
    public static void main(String... args) throws Exception{
        Exceptions t = new Exceptions();
        t.cal();
        t.calSize();
    }
}*/

/*public class Exceptions {
    static void call(int age) throws ArithmeticException{
       //
            if(age<50)
                throw new ArithmeticException("not eligible to vote");
            else
                System.out.println("eligible for vote");
       *//* }catch (Exception e){
            System.out.println("");
        }*//*
    }
    public static void main(String... args) throws ArithmeticException{
        call(15);
    }
}*/

/*public class Exceptions {
    public static void main(String... args){
        try {
            method();
        }catch (IOException e){
            System.out.println("caught");
        }
    }
    public static IOException method(){
        try {
            return new IOException();
        }catch (FileNotFoundException e){
            return new FileNotFoundException();
        }
    }
}*/

