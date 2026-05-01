public class AreaOfEquilateraltriangle {
    public static void main(String[] args) {
        double side=5.0;
        areaOfEquilateraltriangle(side);
    }
    static void areaOfEquilateraltriangle(double s){
        double area=(Math.sqrt(3)/4)*s*s;
        System.out.println("Area of equilateral triangle is: "+area);
    }
    
}
