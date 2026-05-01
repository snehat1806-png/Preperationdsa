public class Perimeterr {
    public static void main(String[] args) {
        double length=5.0;
        double breadth=10.0;
        perimeterOfRectangle(length, breadth);
        perimeterOFParellolagram(length, breadth);
    }
    static void perimeterOfRectangle(double l, double b){
        double perimeter=2*(l+b);
        System.out.println("Perimeter of rectangle is: "+perimeter);
    }
    static void perimeterOFParellolagram(double l, double b){
        double perimeter=2*(l+b);
        System.out.println("Perimeter of parellolagram is: "+perimeter);
    }

}
