public class DigitReverse {
    public static void main(String[] a) {
        int n=12345;
        int rev=0;
        while(n!=0) {
            int ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }
        System.out.println(rev);
    }
}
