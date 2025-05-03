public class Basic {
    public static void main(String[] a) {
        String name="Shivam";
        String name2="Shivam";
        String name3=new String("Shivam");
        System.out.println(name==name2); 
        System.out.println(name.equals(name2));
        System.out.println(name==name3);
        System.out.println(name.equals(name3));
        System.out.println(name.compareTo(name2));
    
    }
}

