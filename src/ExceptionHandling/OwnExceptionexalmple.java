package ExceptionHandling;

public class OwnExceptionexalmple {
    public static void main(String[] args) {
        try{
            System.out.println("inside try block");
            int a=10;
            if(a==10){
                throw new MyOwnException("some randome own exception");
            }
    }catch (Exception e1){
            System.out.println("exception occured"+e1.getMessage());
        }

    }
}
