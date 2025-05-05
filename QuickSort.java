public class QuickSort {
    public static void quickSort(int num[],int si,int ei) {
        if(si>=ei) {
            return;
        }
        int pidx=partition(num,si,ei);
        quickSort(num,si,pidx-1);
        quickSort(num,pidx+1,ei);
    }
    public static int partition(int num[],int si,int ei) {
        int pivot=num[ei];
        int i=si-1;
        for(int j=si;j<ei;j++) {
            if(num[j]<pivot) {
                i++;
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
        i++;
        int temp=pivot;
        num[ei]=num[i];
        num[i]=temp;
        return i;
    }
}