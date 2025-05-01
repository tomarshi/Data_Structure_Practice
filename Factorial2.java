public class Factorial2 {
  public static int findFactorial(int n) {
    if(n==0) {
        return 1;
    }
    int fnm1=findFactorial(n-1);
    int f=n*fnm1;
    return f;
  }
  public static void main(String[] args) {
    int n=5;
    int f=findFactorial(n);
    System.out.println(f);
  }
}
