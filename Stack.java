package stack_1_array;

public class Stack {
    static final int MAX = 1000;
    int top;
    int arr[] = new int[MAX];

    public Stack() {
        top = -1;
    }
    
    boolean isEmpty(){
        return (top < 0);
    }
    
    boolean push(int v){
        if(top >= MAX - 1){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            arr[++top] = v;
            //top++;
            System.out.println(v + " pushed into stack");
            return true;
        }
    }
    
    int pop(){
        if(top < 0){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            int x = arr[top--];
            return x;
        }
    }
    
    int peek(){
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return arr[top];
        }
    }
    
    int size(){
        int x = top+1;
        return x;
    }
    
    void display(){
        for(int i = top; i>-1; i--){
            System.out.println("A[" + i + "] : " + arr[i]);
        }
    }
    
}
