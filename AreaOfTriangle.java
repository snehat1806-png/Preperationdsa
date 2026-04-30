public class AreaOfTriangle {
    public static void main(String[] args) {
        double base=5.0;
        double height=10.0;
        areaOfTriangle(base, height);
    }
    static void areaOfTriangle(double b, double h){
        double area=0.5*b*h;
        System.out.println("Area of triangle is: "+area);
    }
}
