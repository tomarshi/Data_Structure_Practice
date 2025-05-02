public class Pairsum {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        int key=6;
        int si=0;
        int ei=num.length-1;
        while(si!=ei) {
            if(num[si]+num[ei]==key) {
                System.out.println(num[si]+" "+num[ei]);
               
            }
            else if(num[si]+num[ei]<key) {
                si++;
            }
            else {
                ei--;
            }
        }
    }
}
