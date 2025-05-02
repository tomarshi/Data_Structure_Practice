public class StockSpan {
    public static void main(String[] a) {
        int stock[]={100,80,60,70,60,75,85};
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0;i<stock.length;i++) {
            if(buyprice<stock[i]) {
                int profit=stock[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else {
                buyprice=stock[i];
            }
        }

    }
}
