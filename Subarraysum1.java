public class Subarraysum1 {
    public static void main(String[] a) {
        int num[]={1,2,3,4,5};
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<num.length;i++) {
            for(int j=i;j<num.length;j++) {
                 currsum=0;
                 for(int k=i;k<=j;k++) {
                     currsum+=num[k];
                 }
                 if(currsum>maxsum) {
                     maxsum=currsum;
                 }
            }
            System.out.println(maxsum);
        }
    }
}
