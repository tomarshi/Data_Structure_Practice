public class AnagramsString {
    public static boolean isAnagram(String str1 String str2) {
        str1.toLowerCase();
        str2.toLowerCase();
        if(str1.length() == str2.length()) {
            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);
            return Arrays.equals(str1Array, str2Array);
        }
        return false;
    }
}