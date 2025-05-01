public class GreatestNumber {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int c=5;
        if(a>b&&a>c) {
            System.out.println(a+" is the greatest number.");
            if(b>a&&b>c) {
                System.out.println(b+" is the second greatest number.");
            } else {
                System.out.println(c+" is the second greatest number.");
            }
        }
    }
}
