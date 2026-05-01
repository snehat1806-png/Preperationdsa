public class PerimeterOfSquare {
    public static void main(String[] args) {
        double side=5.0;
        perimeterOfSquare(side);
    }
    static void perimeterOfSquare(double s){
        double perimeter=4*s;
        System.out.println("Perimeter of square is: "+perimeter);
    }
}
