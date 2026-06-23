public class leetcode47 {
//https://leetcode.com/problems/fair-candy-swap/description/ 
public static void main(String[] args) {
    int[] aliceSizes = {1, 1};
    int[] bobSizes = {2, 2};
    int[] result = fairCandySwap(aliceSizes, bobSizes);
    System.out.println("[" + result[0] + ", " + result[1] + "]");
}  
static int[] fairCandySwap(int[] aliceSizes,int[] bobSizes){
     int sumA=0;
     int sumB=0;
        for(int i=0;i<aliceSizes.length;i++){
            sumA+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++){
            sumB+=bobSizes[i];
        }
        for(int i=0;i<aliceSizes.length;i++){
            for(int j=0;j<bobSizes.length;j++){
                int newAlice=sumA-aliceSizes[i]+bobSizes[j];
                int newBob=sumB-bobSizes[j]+aliceSizes[i];
                if(newAlice==newBob){
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return new int[0];
} 
}
