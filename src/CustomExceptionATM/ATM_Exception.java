package CustomExceptionATM;

public class ATM_Exception extends Custom_ExceptionATM{
    public ATM_Exception(String str) {
        super(str);
    }

    static void abc(int pin) throws Custom_ExceptionATM{
        /*try {*/
            if(pin<99){
                throw new Custom_ExceptionATM("pin is invalid.");
            }
            else {
                System.out.println("pin is good.");
            }
        } /*catch (Custom_ExceptionATM e) {
            System.out.println(e);;
        }*/
    //}

    public static void main(String... args) throws Custom_ExceptionATM {
        abc(10);
    }
}
