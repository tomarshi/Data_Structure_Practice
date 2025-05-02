public class KadanesAlgorithm {
    public static void main(String[] a) {
        int num[]={-2,-3,-4,-1,-2};
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++) {
            curr+=num[i];
            if(curr<0) {
                curr=0;
            }
            max=Math.max(max,curr);
        }
        System.out.println(max);
    }
}
