public class ClearLastIthBit {
    public static void main(String[] args) {
        int n=15;
        int i=3;
        int bitmask=(~0)<<i;
        int ans=n&bitmask;
        System.out.println(ans);
    }
}
