public class Pairs {
    public static void main(String[] a) {
        int num[]={1,2,3,4,5};
        for(int i=0;i<num.length;i++) {
            int curr=num[i];
            for(int j=i+1;j<num.length;j++) {
                System.out.println(curr + "," + num[j]);
            }
        }
    }
}
