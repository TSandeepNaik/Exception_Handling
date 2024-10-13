package ExceptionHandling;
// in this code as soon as try block finds the exception it will go to first catch block and excecutes
//  and it will not come back and check the  second exception it will move forward.
public class MultipleCatchExample {
    public static void main(String[] args) {
       try{
           System.out.println("inside the try block");
           int a = 10;
           int res = a/0;
           int []arr = {1, 2, 3, 4, 5};
           System.out.println("array valur at index 5 :"+arr[7]);
       }
       // for first exception
       catch(ArithmeticException e1 ){
           System.out.println("exception occured "+e1.getMessage());
       }
// for second exception
       catch(ArrayIndexOutOfBoundsException e2 ){
           System.out.println("exception occured "+e2.getMessage());
       }
        System.out.println("after the catch block");
    }
}
