public class SmallestNumber {
    public static void find(int num[]) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++) {
            if(num[i]<min) {
                min=num[i];
            }
        }
        System.out.println("Smallest number in the array is: " + min);
    }
    
}
