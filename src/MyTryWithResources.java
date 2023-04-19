class Bar implements AutoCloseable{

    public Bar(){
        System.out.println("Inside Bar Class");
    }
    public void doSomething(){
        System.out.println("Doing something in Bar!");
    }
    public void close() throws Exception{
        System.out.println("Closing Bar");
    }
}

class Foo implements AutoCloseable{
    public Foo(){
        System.out.println("Inside Foo Class");
    }
    public void doSomething() throws Exception{
        throw new Exception("Exception from Foo doSomething() method");
    }
    public void close() throws Exception{
        System.out.println("Closing Foo");
        throw new Exception("Unable to close Foo...");
    }
}

public class MyTryWithResources {
    public static void main(String[] args)
    {
        try (Bar b = new Bar(); Foo f = new Foo() ) {
            b.doSomething();
            f.doSomething();
        } catch (Exception ex) {
            System.out.println("In catch... " + ex);
        } finally {
            System.out.println("In finally...");
        }
    }
}


