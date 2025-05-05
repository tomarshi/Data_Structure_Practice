package Sorting;

public class SelectionSort {
    public static void main(String[] a) {
        int num[]={1,2,3,4,5};
        for(int i=0;i<num.length-1;i++) {
            int minpos=i;
            for(int j=i+1;j<num.length;j++) {
                if(num[minpos]>num[j]) {
                    minpos=j;
                }
            }
            int temp=num[minpos];
            num[minpos]=num[i]; 
            num[i]=temp;
        }
    }
}
