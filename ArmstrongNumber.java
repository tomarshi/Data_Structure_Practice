public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int sum=0;
        int temp=n;
        while(n!=0) {
            int ld=n%10;
            sum=sum+(ld*ld*ld);
            n=n/10;
        }
        if(temp==sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
    
}
