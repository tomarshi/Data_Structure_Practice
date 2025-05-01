import java.util.*;
public class PrimeNumber {
    public static boolean isPrime(int n) {
        boolean isPrime=true;
        if(n==2) {
            return isPrime;
        }
        else {
            for(int i=2;i<Math.sqrt(n);i++) {
                if(n%i==0) {
                    isPrime=false;
                    break;
                }
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(isPrime(n)) {
            System.out.println(n+" is a prime number.");
        } else {
            System.out.println(n+" is not a prime number.");
        }
    }
}
