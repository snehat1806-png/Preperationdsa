import java.util.Scanner;
public class Sreverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = in.nextLine();
       // String reversedStr = reverseString(str);
        String reversedStrWithoutSB = reverseStringWithoutStringBuilderString(str);
        System.out.println("Original String: " + str);
        //System.out.println("Reversed String: " + reversedStr);
        System.out.println("Reversed String without StringBuilder: " + reversedStrWithoutSB);
        in.close();
    }
    static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
    //without string builder reverse string
    static String reverseStringWithoutStringBuilderString(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }
}
