public class Pairsum1 {
    public static boolean pairsum(int num[],int tar) {
        int bp=0;
        for(int i=1;i<num.length;i++) {
            if(num[i]>num[i+1]) {
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp) {
            if(num[lp]+num[rp]==tar) {
                return true;
            }
            else if(num[lp]+num[rp]<tar) {
                lp=(lp+1)%num.length;
            }
            else {
                rp=(rp-1+num.length)%num.length;
            }
        }
        return false;
    }
}
