package ExceptionHandling;

public class GenericCatchblock {
    public static void main(String[] args) {
        try{
            System.out.println("inside the try block");
            int a = 10;
            int res = a/0;
            int []arr = {1, 2, 3, 4, 5};
            System.out.println("array valur at index 5 :"+arr[7]);
        }
        // for first exception
        catch(Exception e ){
            System.out.println("exception occured "+e.getMessage());
        }

        System.out.println("after the generic catch block");
    }
}
