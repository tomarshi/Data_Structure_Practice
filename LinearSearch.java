public class LinearSearch {
    public static int find(int num[],int key) {
        for(int i=0;i<num.length;i++) {
            if(num[i]==key) {
                return i; 
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int num[] = {10,20,30,40,50};
        int key = 30;
        int index = find(num,key);
        if(index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}