


public class Circle implements Shape{

    double PI = 3.14;

    double radius;


    public Circle ( double radius ) {
        this.radius=radius;
    }

    public double perimeter() {
        return 2*PI*radius;
    }
    public double area() {

        return PI * radius * radius;
    }



}
