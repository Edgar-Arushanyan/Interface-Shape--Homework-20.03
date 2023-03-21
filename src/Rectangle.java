

public class Rectangle implements Shape{

    double length;
    double width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;

    }

    public double area (){
        return length * width;
    }
    public double perimeter(){
        return 2 * (length + width);
    }


}
