public class VolumeOfCone {
    public static void main(String[] args) {
        double radius=5.0;
        double height=10.0;
        volumeOfCone(radius, height);
    }
    static void volumeOfCone(double r, double h){
        double volume=(1.0/3)*Math.PI*r*r*h;
        System.out.println("Volume of cone is: "+volume);
    }
}
