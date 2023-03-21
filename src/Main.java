import java.nio.channels.Pipe;

public class Main {

    public static void main(String[] args) {


        Shape circle = new Circle(5 );

        System.out.println("Circle has area of "+circle.area()); //Circle has area of 78.5

        System.out.println("Circle has perimeter of"+circle.perimeter()); //Circle has perimeter of 31.400000000000002


        System.out.println("-------------------------------------------");

        Shape rectangle = new Rectangle(10,20);

        System.out.println("Rectangle has area of "+rectangle.area()); //Rectangle has area of 200.0

        System.out.println("Rectangle has perimeter of "+rectangle.perimeter()); //Rectangle has perimeter of 60.0






    }


}
