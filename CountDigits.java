public class CountDigits {
    public static void main(String[] a) {
        int n=12345;
        int c=0;
        while(n!=0) {
            int ld=n%10;
            c++;
            n=n/10;
        }
        System.out.println(c);
    }
}
