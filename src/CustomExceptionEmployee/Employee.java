package CustomExceptionEmployee;

public class Employee extends CustomException{
    public Employee(String str) {
        super(str);
    }

    static void employee_salary(int salary){
        try {
            if (salary < 10000) {
                throw new CustomException("Salary is less then 10000");
            }             else {
                System.out.println("salary is good.");
            }
        }catch (CustomException e){
            System.out.println(e);
        }
    }
    public static void main(String... str){
        employee_salary(9000);
    }
}

