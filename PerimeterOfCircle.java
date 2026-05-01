public class PerimeterOfCircle {
    public static void main(String[] args) {
        double radius=5.0;
        perimeterOfCircle(radius);
    }
    static void perimeterOfCircle(double r){
        double perimeter=2*Math.PI*r;
        System.out.println("Perimeter of circle is: "+perimeter);
    }
}
