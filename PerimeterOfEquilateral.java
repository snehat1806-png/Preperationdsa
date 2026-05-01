public class PerimeterOfEquilateral {
    public static void main(String[] args) {
        double side=5.0;
        perimeterOfEquilateral(side);
    }
    static void perimeterOfEquilateral(double s){
        double perimeter=3*s;
        System.out.println("Perimeter of equilateral triangle is: "+perimeter);
    }
}
