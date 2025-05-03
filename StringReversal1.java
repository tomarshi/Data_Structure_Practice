public class StringReversal {
    public static void main(String[] args) {
        String str="Shivam";
        String rev="";
        for(int i=0;i<str.length();i++) {
            rev=rev+str.charAt(str.length()-1-i);
        }
        System.out.println(rev);
    }
}