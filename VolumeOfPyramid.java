public class VolumeOfPyramid {
    public static void main(String[] args) {
        double baseArea=25.0;
        double height=10.0;
        double volume=calculateVolume(baseArea, height);
        System.out.println("Volume of the pyramid: "+volume);
    }
    static double calculateVolume(double baseArea, double height){
        return (1.0/3.0)*baseArea*height;
    }
}
