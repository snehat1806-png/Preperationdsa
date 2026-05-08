public class MaxMin {
    //Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
 public static void main(String[] args) {
    int a=10,b=20,c=5;
    max(a,b,c);
    min(a,b,c);

 }
 static void max(int a,int b,int c){
   if(a>b&&a>c){
    System.out.println(a+" is greatest number.");
   }else if(b>a&&b>c){
    System.out.println(b+"is greatest number.");
   }else{
    System.out.println(c+"is greatest number.");
   }
 }
 static void min(int a,int b,int c){
  if(a<b&&a<c){
    System.out.println(a+" is smallest number.");
   }else if(b<a&&b<c){
    System.out.println(b+"is smallest number.");
   }else{
    System.out.println(c+"is smallest number.");
   }
 }
}
