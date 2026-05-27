package leetcode;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class Leetcode10 {
    public static void main(String[] args) {
       // String sentence="thequickbrownfoxjumpsodhhhverthelazydog";
       String sentence="letcode";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
        sentence=sentence.toLowerCase();
        boolean [] seen = new boolean[26];
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(ch>='a'&&ch<='z'){
                seen[ch-'a']=true;
            }
        }
        for(int i=0;i<26;i++){
            if(!seen[i]){
                return false;
            }
        }
        return true;
    }
    }
