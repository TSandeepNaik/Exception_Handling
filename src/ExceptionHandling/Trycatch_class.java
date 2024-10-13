package ExceptionHandling;

public class Trycatch_class {
    public static void main(String[] args) {
        int a = 5; int res =0;

        try{
            System.out.println("before exception");
            res = a/0;
            System.out.println("after exception");
        } catch (ArithmeticException e1) {
            System.out.println("exception occur :"+ e1.getMessage());
        }
        System.out.println("before exception a value :"+a);
        System.out.println("after exception res value :"+res);
    }
}
