public class Uppercase {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();
        char ch=Character.toUpperCase(str.charAt(0));
        for(int i=1;i<str.length();i++) {
            if(i<str.length()-1&&str.charAt(i)==' ') {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
                
                
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}