public class MergeSort {
    public static void mergesort(int num[],int si,int ei) {
        if(si>=ei) {
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort(num,si,mid);
        mergesort(num,mid+1,ei);
        merge(num,si,mid,ei);
    }
    public static void merge(int num[],int si,int mid,int ei) {
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei) {
            if(num[i]<num[j]) {
                temp[k]=num[i];
                i++;
            } else {
                temp[k]=num[j];
                j++;
            }
            k++;
        }
        while(i<=mid) {
            temp[k++]=num[i++];
            
        }
        while(j<=ei) {
            temp[k++]=num[j++];
        }
        for( k=0,i=si;k<temp.length;k++,i++) {
            num[i]=temp[k];
        }
    }
}