package ExceptionHandling;

public class NestedTryBlocks {
    public static void main(String[] args) {
        try{
            System.out.println("inside first try block");
            int a = 10;
            int res =0;
            System.out.println("before exception");
            res = a/0;
            System.out.println("after exception");

            try {
                System.out.println("inside 2nd try block");
                String name = "sandeep";
                System.out.println("name length is :"+name.length());
                String notname = null;
                System.out.println("lenght of the notname is :"+notname.length());

                try{
                    System.out.println("inside the 3rd try block");
                    int []arr = {1, 2, 3, 4, 5};
                    System.out.println("array valur at index 5 :"+arr[7]);
                }
                // for first exception
                catch(ArrayIndexOutOfBoundsException e3 ){
                    System.out.println("inside 3rd catch block");
                    System.out.println("exception occured "+e3.getMessage());
                }
            }catch (NullPointerException e2){
                System.out.println("inside 2nd catch block");
                System.out.println("after exception :"+ e2.getMessage());
            }
        } catch (ArithmeticException e1) {
            System.out.println("inside first catch block");
            System.out.println("exception occur :"+ e1.getMessage());
        }
    }
}
