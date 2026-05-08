public class p14 {
    //Calculate CGPA Java Program
    public static void main(String[] args) {
        double totalMarks=450;//Total marks obtained by the student
        double maxMarks=500;//Maximum marks for the course
        double cgpa=(totalMarks/maxMarks)*10;
        //CGPA is calculated by dividing the total marks obtained by the maximum marks and then multiplying the result by 10.
        //In this case, the CGPA will be (450/500)*10 = 9.0.
        //The CGPA is then printed to the console.
        System.out.println("CGPA is: "+cgpa);
    }
}
