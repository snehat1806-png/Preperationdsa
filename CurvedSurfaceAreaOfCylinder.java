public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        double radius=5.0;
        double height=10.0;
        double curvedSurfaceArea=calculateCurvedSurfaceArea(radius, height);
        System.out.println("Curved Surface Area of the cylinder: "+curvedSurfaceArea);
    }
    static double calculateCurvedSurfaceArea(double radius, double height){
        return 2*Math.PI*radius*height;
    }
}
