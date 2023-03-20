

public class Rectangle implements Shape{

    double length;
    double width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;

    }

    public double Area (){
        return length * width;
    }
    public double Perimeter(){
        return 2 * (length + width);
    }


}
