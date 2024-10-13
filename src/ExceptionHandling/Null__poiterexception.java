package ExceptionHandling;

import java.sql.Struct;

public class Null__poiterexception {
    public static void main(String[] args) {

        try {
            String name = "sandeep";
            System.out.println("name length is :"+name.length());
            String notname = null;
            System.out.println("lenght of the notname is :"+notname.length());
        }catch (NullPointerException e1){
            System.out.println("after exception :"+ e1.getMessage());
        }


    }
}
