import java.util.Date;
import java.awt.Point;

public class HelloWorld {
    /*
 Java code cannot float around freely. everything must live inside a class. so over here we are delcaring
 the class
 */
    public static void main(String[] args) {

        //String message = new String("Hello world");

        String message = "Hello World" + "!!";

        //message.endsWith("!!");

        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("!", "*"));
    
    }
}
 