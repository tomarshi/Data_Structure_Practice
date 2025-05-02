public class ReverseArray2 {
    public static void reverse(int num[]) {
        int si=0;
        int ei=num.length-1;
        while(si<ei) {
            int temp=num[si];
            num[si]=num[ei];
            num[ei]=temp;
            si++;
            ei--;
        }
    }
}
