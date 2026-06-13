public class leetcode38 {
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public static void main(String[] args) {
    char[] letters = {'c','f','j'};
    char target = 'a';
    System.out.println(nextGreatestLetter(letters,target));    
}
public static char nextGreatestLetter(char[] letters,char target){
    int left=0;
    int right=letters.length-1;
    while(left<=right){
        int mid=left+(right-left)/2;
        if(letters[mid]<=target){
            left=mid+1;
    }
        else{
            right=mid-1;
        }
    }
    return letters[left%letters.length];
}
}
