public class EvenOddSum {
    public static void main(String[] a) {
        int n=12345;
        int es=0;
        int os=0;
        while(n>0) {
            int ld=n%10;
            if(ld%2==0) {
                es=es+ld;
            } else {
                os=os+ld;
            }
        }
    }
}
