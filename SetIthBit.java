public class SetIthBit {
    public static void main(String[] a) {
        int n=5;
        int i=2;
        int bitmask=(1<<i);
        int ans=n|bitmask;
        System.out.println(ans);
    }
}
