public class Subarraysum2 {
    public static void main(String[] a) {
        int num[]={1,2,3,4,5};
        int prefix[]=new int[num.length];;
        prefix[0]=num[0];
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++) {
            prefix[i]=prefix[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++) {
            for(int j=i;j<num.length;j++) {
                int currsum=0;
                if(i==0) {
                    currsum=prefix[j];
                } else {
                    currsum=prefix[j]-prefix[i-1];
                    
                }
                maxsum=Math.max(maxsum,currsum);
                System.out.println(currsum);
            }
        }
        System.out.println(maxsum);
        

    }
}
