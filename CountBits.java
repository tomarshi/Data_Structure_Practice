public class CountBits {
    public static void main(String[] a) {
        int n=5;
        int count=0;
        while(n>0) {
            if((n&1)!=0) {
                count++;
            }
            n=n>>1;
        }
    }
}
