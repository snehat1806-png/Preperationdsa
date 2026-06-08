//https://leetcode.com/problems/guess-number-higher-or-lower/description/
public class leetcode33{
    public static void main(String[]args){
        int n=10;
        System.out.println(guessNumber(n));
    }
    static int guessNumber(int n){
        // int low=1;
        // int high=n;
        // while(low<=high){
        //     int mid=low+(high-low)/2;
        //     if(guess(mid)==0){
        //         return mid;
        //     }
        //     else if(guess(mid)==-1){
        //         high=mid-1;
        //     }
        //     else{
        //         low=mid+1;
        //     }
        // }
        // return -1;
        return search(1,n);
    }
    static int search(int low,int high){
        //recursive call
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;

        if(guess(mid)==0){
            return mid;
        }
        else if(guess(mid)==-1){
            return search(low,mid-1);
        }
        else{
            return search(mid+1,high);
        }
    }
    
    // Mock guess function for testing
    static int guess(int num){
        int pick = 6; // example target
        if(num > pick) return -1;
        if(num < pick) return 1;
        return 0;
    }
} 