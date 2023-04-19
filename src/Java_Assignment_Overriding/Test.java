package Java_Assignment_Overriding;

public class Test {
    public static void main(String... args){
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        System.out.println("SBI rate of interest : " + sbi.rateOfInterest());
        System.out.println("ICICI rate of interest : " + icici.rateOfInterest());
    }
}
