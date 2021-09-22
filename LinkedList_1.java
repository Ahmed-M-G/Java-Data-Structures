package linkedlist_1;

import java.util.Scanner;

public class LinkedList_1 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        int n, number;
        System.out.println("Enter Number Of Elements : ");
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println("Enter Numbers To Fill The List : ");
            number = sc.nextInt();
            L.insert(number, i);
        }
        
//        L.addFirst(0);
//        L.addFirst(1);
//        L.addFirst(2);
//        L.addFirst(3);
//        L.addFirst(4);
//        L.addFirst(5);
//        L.addLast(6);
//        L.insert(15, 2);
        System.out.println("\n============== Full List ==================\n");
        L.display();
        System.out.println("\n============== Delete First ==================\n");
        L.deleteFirst();
        L.display();
        System.out.println("\n============== Delete Last =================\n");
        L.deleteLast();
        L.display();
        System.out.println("\n============== Delete indx 3 ==================\n");
        L.delete(3);
        L.display();
        System.out.println("\n=============== Index Of 15 =================\n");
        int ind = L.indexOf(15);
        System.out.println("The Index Of Element Is : " + ind);
        System.out.println("\n=============== Index Of 4 =================\n");
        int indx = L.indexOf(4);
        System.out.println("The Index Of Element Is : " + indx);
        System.out.println("\n=============== Add First =================\n");
        L.addFirst(0);
        L.display();
        System.out.println("\n=============== AddLast =================\n");
        L.addLast(10);
        L.display();
        System.out.println("\n================ Insert ================\n");
        L.insert(8, 4);
        L.display();
        
    }
    
}
