public class DigitSum {
    public static void main(String[] a) {
        int n=12345;
        int sum=0;
        while(n>0) {
            int ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        System.out.println(sum);
    }
}
