public class DecimalToBinary {
    public static void main(String[] a) {
        int n=10;
        int bin=0;
        int pow=0;
        while(n>0) {
            int ld=n%2;
            bin=bin+(ld*(int)Math.pow(10,pow));
            n=n/2;
            pow++;
        }
        System.out.println(bin);
    }
}
