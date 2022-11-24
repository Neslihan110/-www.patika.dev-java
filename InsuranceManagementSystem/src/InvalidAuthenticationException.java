package Z_Homeworks.InsuranceManagementSystem;

public class InvalidAuthenticationException extends Exception{
    public InvalidAuthenticationException(String msg){
        super(msg);
        System.out.println("Invalid passsword!");
    }
}
