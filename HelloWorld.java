import java.util.Date;
import java.awt.Point;

public class HelloWorld {
    /*
 Java code cannot float around freely. everything must live inside a class. so over here we are delcaring
 the class
 */
    public static void main(String[] args) {


        byte x = 2;
        byte y = x;

        x = 4;
        System.out.println(y);


        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        /*
            Reference types are copied by the references while primitive types are copied by their value
        */
    
    }
}
 