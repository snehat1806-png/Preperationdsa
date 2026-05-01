public class VolumeOfCylinder {
    public static void main(String[] args) {
        double radius=5.0;
        double height=10.0;
        volumeOfCylinder(radius, height);
    }
    static void volumeOfCylinder(double r, double h){
        double volume=Math.PI*r*r*h;
        System.out.println("Volume of cylinder is: "+volume);
    }
}
