import java.util.Date;

public class HelloWorld {
    /*
 Java code cannot float around freely. everything must live inside a class. so over here we are delcaring
 the class
 */
    public static void main(String[] args) {

       byte age = 30;
       // When dealing with reference types, always allocate memory
       Date now = new  Date();
       //reference types have members

        System.out.println(now);
    
    }
}
 