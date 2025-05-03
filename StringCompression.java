public class StringCompression {
    public static int doWork(String str) {
        String str="";
        for(int i=0;i<str.length();i++) {
            Integer count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            str+=str.charAt(i);
            if(count>1) {
                str+=count.toString();
            }
        }
        return str;
    }
}