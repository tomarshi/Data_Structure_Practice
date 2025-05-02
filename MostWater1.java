import java.util.*;

public class MostWater1 {
    public static int water(ArrayList<Integer> list) {
       int max=0;
       for(int i=0;i<list.size();i++) {
        for(int j=i+1;j<list.size();j++) {
            int height=Math.min(list.get(i), list.get(j));
            int width=j-i;
            int curr=height*width;
            max=Math.max(max, curr);
        }
        
       }
       return max;
    }
}
