package ExceptionHandling;

public class Throw_ExceptionExample {
    public  void sample() {
        System.out.println("inside sample methode before throwing exception");
        int a = 10;
        if (a == 10) {
            throw new RuntimeException("some random exception");
        }
        System.out.println("value of a is : "+a);
    }
    public static void main(String[] args) {

        // to handle the exception we use the try and catch block only in any scenario
        try {
            Throw_ExceptionExample obj = new Throw_ExceptionExample();
            obj.sample();
        }catch(Exception e1){
            System.out.println("after exception occured "+e1.getMessage());
        }
    }
}
