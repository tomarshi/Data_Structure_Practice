package Sorting;
public class BubbleSort {
    public static void main(String[] a) {
        int num[]={1,5,2,6,7,3,4};
        for(int i=0;i<num.length-1;i++) {
            for(int j=0;j<num.length-i;j++) {
                if(num[j]>num[j+1]) {
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }
}
