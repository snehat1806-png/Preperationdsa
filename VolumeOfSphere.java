public class VolumeOfSphere {
    public static void main(String[] args) {
        double radius=5.0;
        volumeOfSphere(radius);
    }
    static void volumeOfSphere(double r){
        double volume=(4.0/3)*Math.PI*r*r*r;
        System.out.println("Volume of sphere is: "+volume);
    }
}
