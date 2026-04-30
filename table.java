import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number for the table of it:");
        int num=input.nextInt();
        multiplication(num);
        input.close();  
    }

    static void multiplication(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num+ "X" +i+ "=" +num*i);
        }
    }
}