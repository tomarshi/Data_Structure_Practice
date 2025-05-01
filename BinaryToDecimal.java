public class BinaryToDecimal {
    public static void main(String[] args) {
        int n=111;
        int dec=0;
        int pow=0;
        while(n>0) {
            int ld=n%10;
            dec=(int) (dec+(ld*Math.pow(2,pow)));
            pow++;
            n=n/10;
        }
        System.out.println(dec);
    }
}
