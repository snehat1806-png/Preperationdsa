public class AreaOfRhombus {
    public static void main(String[] args) {
        double diagonal1=5.0;
        double diagonal2=10.0;
        areaOfRhombus(diagonal1, diagonal2);
    }
    static void areaOfRhombus(double d1, double d2){
        double area=(d1*d2)/2;
        System.out.println("Area of rhombus is: "+area);
    }
}
