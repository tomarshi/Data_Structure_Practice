public class Sum2 {
    public static int findSum(int n) {
        if(n==0) {
            return 0;
        }
        int snm1=findSum(n-1);
        int s=n+snm1;
        return s;
    }
    public static void main(String[] args) {
        int n=5;
        int s=findSum(n);
        System.out.println(s);
    }
}
