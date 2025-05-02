public class BinarySearch {
    public static int find(int num[],int key) {
        int si=0;
        int ei=num.length-1;
        while(si<=ei) {
            int mid=(si+ei)/2;
            if(num[mid]==key) {
                return mid;
            }
            else if(num[mid]<key) {
                si=mid+1;
            }
            else {
                ei=mid-1;
            }
        }
        return -1;
    }
}
