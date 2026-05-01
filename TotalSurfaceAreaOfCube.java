public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        double side=4.0;
        double totalSurfaceArea=calculateTotalSurfaceArea(side);
        System.out.println("Total Surface Area of the cube: "+totalSurfaceArea);
    }
    static double calculateTotalSurfaceArea(double side){
        return 6*side*side;
    }
}
