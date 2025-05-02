public class TrappingRainwater {
    public static int findWater(int height[]) {
        int n=height.length;
        int lm[]=new int[n];
        lm[0]=height[0];
        for(int i=1;i<n;i++) {
            lm[i]=Math.max(height[i],lm[i-1]);
        }
        int rm[]=new int[n];
        rm[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--) {
            rm[i]=Math.max(height[i],rm[i+1]);
        }
        int water=0;
        for(int i=0;i<n;i++) {
            int waterlevel=Math.min(lm[i],rm[i]);
            water+=waterlevel-height[i];
        }
        return water;
    }
    
}
