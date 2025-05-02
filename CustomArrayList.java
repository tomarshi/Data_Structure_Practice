import java.util.*;
public class CustomArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(10); 
        list.add(20);
        list.add(30);
        list.add(40);
        list.set(1,20);
        list.remove(2); 
        list.add(1, 25); 
        System.out.println("ArrayList: " + list);
        System.out.println("Size of ArrayList: " + list.size());
      
    }
}
