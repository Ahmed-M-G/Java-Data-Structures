package arraylist_1;

import java.util.ArrayList;

public class ArrayList_1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");
        
        list.add("Ahmed");
        list.add("Mohmed");
        list.add("Gaber");
        list.add("Ali");
        list.add("Kareem");
        
        System.out.println(list.size());
        System.out.println("======================");
        System.out.println(list);
        System.out.println("======================");
        System.out.println(list.get(0));
        System.out.println("======================");
        list.add(3, "Ibrahim");
        System.out.println(list);
        System.out.println("======================");
        System.out.println(list.size());
        System.out.println("======================");
        System.out.println(list.set(4, "Mostafa"));
        System.out.println("======================");
        System.out.println(list);
        System.out.println("======================");
        System.out.println(list.size());
        System.out.println("======================");
        System.out.println(list.remove(4));
        System.out.println("======================");
        System.out.println(list);
        System.out.println("======================");
        System.out.println(list.addAll(list2));
        System.out.println("======================");
        System.out.println(list);
        System.out.println("======================");
        System.out.println(list.indexOf("Gaber"));
        System.out.println("======================");
        System.out.println(list.subList(5, 10));
        System.out.println("======================");
        System.out.println(list);
    }
    
}
