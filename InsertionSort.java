package Sorting;

public class InsertionSort {
    public static void main(String[] a) {
        int num[]={1,2,3,4,5};
        for(int i=1;i<num.length;i++) {
            int curr=num[i];
            int prev=i-1;
            while(prev>=0&&num[prev]>curr) {
                num[prev+1]=num[prev];
                prev--;

            }
            num[prev+1]=curr;
        }
    }
}
