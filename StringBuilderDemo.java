public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Shivam");
        System.out.println(sb);
        sb.append(" Kumar");
        System.out.println(sb);
        sb.insert(0, "Mr. ");
        System.out.println(sb);
        sb.delete(0, 4);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}