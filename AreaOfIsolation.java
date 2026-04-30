public class AreaOfIsolation {
    public static void main(String[] args) {
        //Area of isolation triangle
        double base=5.0;
        double height=10.0;
        area(base, height);
        
    }
    static void area(double b, double h){
        double area=0.5*b*h;
        System.out.println("Area of triangle is: "+area);
    }

}
