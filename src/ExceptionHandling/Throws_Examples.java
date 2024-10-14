package ExceptionHandling;

public class Throws_Examples {
// we can also add unchecked exception also not mandatory to add without adding also code will run without error
    public void demo () throws InterruptedException, IllegalAccessException {
        int a = 10;
        if(a==110){
            throw new RuntimeException("a value is 10");
        }
        if(a==20){
            throw new ArithmeticException("a value is 20");
        }
        //it is checked exception is not handled by the jvm so we should add it the throws list in the method itself
        //these are found by compiler during runtime
        if(a==30){
            throw new InterruptedException("a value is 30");
        }
        // same one more checked exception
        if(a==10){
            throw  new IllegalAccessException("a value is 50");
        }
    }
    public static void main(String[] args) {
        // handling using try and catch block
        try{
            //crating object
            Throws_Examples object = new Throws_Examples();
            object.demo();
        }catch (Exception e2){
            System.out.println("after exception occured +"+e2.getMessage());
        }

    }
}
