public class ReverseArray1 {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        int num2[]=new int[num.length];
        for(int i=0;i<num.length;i++) {
            num2[i]=num[num.length-1-i];
        }
    }
}
