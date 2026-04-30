public class AreaOfRectangle {
    public static void main(String[] args) {
        double length=5.0;
        double width=3.0;
        areaOfRectangle(length, width);
    }
    static void areaOfRectangle(double l, double w){
        double area=l*w;
        System.out.println("Area of rectangle is: "+area);
    }
}
