public class SubString {
    public static void find(String str,int si,int ei) {
        String ans="";
        for(int i=si;i<=ei;i++) {
            ans+=str.charAt(i);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String str="Shivam";
        String str2=str.substring(0,3);
        System.out.println(str2);
        String str3=str.substring(3,6);
        System.out.println(str3);
        String str4=str.substring(3);
        System.out.println(str4);
    }
}