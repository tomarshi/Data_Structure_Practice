public class ShortestPath {
    public static int findPath(String str) {
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch=='N') {
                y++;
            } else if(ch=='S') {
                y--;
            } else if(ch=='E') {
                x++;
            } else  {
                x--;
                
         
        }
        int X2=x*x;
        int Y2=y*y;
        return (int)Math.sqrt(X2+Y2);
    }
    }
}