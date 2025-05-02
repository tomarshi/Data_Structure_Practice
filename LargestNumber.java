public class LargestNumber {
    public static void find(int num[]) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++) {
            if(num[i]>max) {
                max=num[i];
            }
        }
        System.out.println("Largest number in the array is: " + max);
    }
    public static void main(String args[]) {
        int num[] = {10,20,30,40,50};
        find(num);
    }
    
}
