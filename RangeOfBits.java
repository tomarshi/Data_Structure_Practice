public class RangeOfBits {
    public static void main(String[] args) {
        int i=2;
        int j=5;
        int n=15;
        int a=(1<<i)-1;
        int b=(~0<<(j+1));
        int mask=a|b;
        int ans=n&mask;
        System.out.println(ans);
    }
}
