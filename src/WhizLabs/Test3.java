package WhizLabs;

public class Test3 {
    static Integer i ;
    public static void main(String... args) throws Exception {
        print();
        per p = new stu("a");


    }
    public static void print()throws Exception{
        System.out.println("a");
        throw new Exception();
    }
}

interface per{

}

class stu implements per{
    stu(String a){

    }
}
