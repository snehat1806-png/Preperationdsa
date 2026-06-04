//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/2022485689/
public class leetcode31{
    public static void main(String[] args){
        int num=14;
        System.out.println(numberOfSteps(num));
    }
    static int numberOfSteps(int num){
        int steps=0;
        while(num>0){
            if(num%2==0){
                num=num/2;
            }else{
                num=num-1;
            }
            steps++;
        }
        return steps;
    }
}