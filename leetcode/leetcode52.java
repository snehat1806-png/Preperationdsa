//https://leetcode.com/problems/power-of-two
public class leetcode52 {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n){
        for(int i=0;i<32;i++){
            if(n==(int)Math.pow(2,i)){
                return true;
            }
        }
        return false;
    }   
}