public class MostWater2 {
    public static int maxArea(int height[]) {
        int maxWater=0;
        int si=0;
        int ei=height.length-1;
        while(si<ei) {
            int ht=Math.min(height[si],height[ei]);
            int width=ei-si;
            int currWater=ht*width;
            maxWater=Math.max(maxWater,currWater);
            if(height[si]<height[ei]) {
                si++;
            }
            else {
                ei--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
