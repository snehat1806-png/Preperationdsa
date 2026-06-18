//https://leetcode.com/problems/fair-candy-swap/description/
public class leetcode44{
    public static void main(String[] args){
        int[] aliceSizes = {1, 2, 5};
        int[] bobSizes = {2, 4};

        int[] result = fairCandySwap(aliceSizes, bobSizes);

        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
    public static int[] fairCandySwap(int[] aliceSizes,int[] bobSizes){
        int sumA=0,sumB=0;
        for(int i=0;i<aliceSizes.length;i++){
            sumA+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++){
            sumB+=bobSizes[i];
        }
        for(int i=0;i<aliceSizes.length;i++){
            for(int j=0;j<bobSizes.length;j++){
                if(sumA-aliceSizes[i]+bobSizes[j]==sumB-bobSizes[j]+aliceSizes[i]){
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return new int[]{0,0};
    }
}