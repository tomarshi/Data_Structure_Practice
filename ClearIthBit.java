public class ClearIthBit {
    public static void main(String[] a) {
        int n=5; 
        int i=1;
        int mask=~(1<<i); 
        n=n&mask;
        System.out.println(n); 
    }
}
