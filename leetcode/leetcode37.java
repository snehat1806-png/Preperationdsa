public class leetcode37 {
//https://leetcode.com/problems/arranging-coins/description/
public static void main(String[] args) {
    int n = 8;
    System.out.println(arrangeCoins(n));
}
public static int arrangeCoins(int n){
    int rows = 0;
    while(n>=rows+1){
        rows++;
        n-=rows;
    }
    return rows;
}
}
