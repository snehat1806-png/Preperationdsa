public class PalindromeS {
    public static void main(String[] args) {
    String str="Snehahens";
    String reverse="";
    String Lower=str.toLowerCase();
    for(int i=Lower.length()-1;i>=0;i--){
        reverse=reverse+Lower.charAt(i);
    }
    if(Lower.equals(reverse)){
        System.out.println("The given string is a palindrome");
    }
    else{
        System.out.println("The given string is not a palindrome");
    }
}
}
