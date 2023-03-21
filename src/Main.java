import java.nio.channels.Pipe;

public class Main {

    public static void main(String[] args) {


        Circle circle = new Circle(5 );

        System.out.println("Circle has area of "+circle.area());
        System.out.println("Circle has perimeter "+circle.perimeter());

        System.out.println("-------------------------------------------");

        Rectangle rectangle = new Rectangle(10,20);

        System.out.println("Rectangle has area of "+rectangle.area());
        System.out.println("Rectangle has perimeter of "+rectangle.perimeter());





    }


}
