public class UpdateIthBit {
    public static int clearBit(int n,int i) {
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static void main(String[] a) {
        int n=5;
        int i=1;
        int newBit=0; 
        n=clearBit(n, i);
        int bitmask=newBit<<i;
        int ans=n|bitmask;
        System.out.println(ans);
        
    }
}
