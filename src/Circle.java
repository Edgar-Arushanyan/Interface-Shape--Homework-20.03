


public class Circle implements Shape{

    double PI = 3.14;

    double radius;


    public Circle ( double radius ) {
        this.radius=radius;
    }

    public double Perimeter() {
        return 2*PI*radius;
    }
    public double Area() {

        return PI * radius * radius;
    }



}
