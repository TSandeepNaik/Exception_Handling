package ExceptionHandling;

// here body with in the finally method will run irrespective of exception is there or not
// you can have only one finally block

public class Finally_example {
    public static void main(String[] args) {
        try{
            int a = 10/10;
            System.out.println("a value is 10");
        } catch (Exception e) {
            System.out.println("exception ocuured "+ e.getMessage());
        }

        finally {
            System.out.println("inside the finally body");
        }
        }
    }

// we can have a try block with finally block or catch block or with both, but we can not have try block alone