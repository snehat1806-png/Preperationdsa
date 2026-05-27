package practiceproblequestion;
public class p9 {
    //Calculate Distance Between Two Points
    public static void main(String[] args) {
        double x1=2,y1=3,x2=5,y2=7;
        //Distance formula: d=√((x2-x1)²+(y2-y1)²)
        double distance=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        //Math.pow is used to calculate the power of a number and Math.sqrt is used to calculate the square root of a number.
        System.out.println("Distance between the two points is: "+distance);
    }
}
