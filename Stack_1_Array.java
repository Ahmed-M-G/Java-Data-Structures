package stack_1_array;
public class Stack_1_Array {

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println("Stack Is Empty : " + s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.println("Elements present in stack :");
        s.display();
        System.out.println("Stack Is Empty : " + s.isEmpty());
        System.out.println("Number Of Elements in stack :" + s.size());
        System.out.println("======================================");
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.println("Elements present in stack :");
        s.display();
        System.out.println("Stack Is Empty : " + s.isEmpty());
        System.out.println("Number Of Elements in stack :" + s.size());
    }
    
}
