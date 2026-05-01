public class VolumeOfPrism {
    public static void main(String[] args) {
        double baseArea=20.0;
        double height=10.0;
        volumeOfPrism(baseArea, height);
    }
    static void volumeOfPrism(double b, double h){
        double volume=b*h;
        System.out.println("Volume of prism is: "+volume);
    }
}
