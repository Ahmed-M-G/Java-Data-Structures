package queue;
public class Queue_1 {
    static final int MAX = 1000;
    int front, rear, queue[] = new int[MAX];

    public Queue_1() {
        front = -1;
        rear = -1;
    }
    
    boolean isFull(){
        return (front == 0 && rear == MAX-1 );
    }
    
    boolean isEmpty(){
        return (front == -1 && rear == -1 );
    }
    
    public void enQueue(int n){
        if(isFull())
            System.out.println("Queue Is Full");
        else{
            if(front==-1)
                front = 0;
            queue[++rear] = n;
            System.out.println("Inserted " + n);
        }
    }
    
    
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue Is Empty");
            return -1;
        }
        else{
            int x = queue[front];
            if(front >= rear){
                rear = -1;
                front = -1;
            }
            else
                front++;
            
            System.out.println("Deleted -> " + x);
            return x;
        }
    }
    
    int peek(){
        if (isEmpty()) {
            System.out.println("Queue Is Empty");
            return -1;
        }
        else{
            int x = queue[front];
            return x;
        }
    }
    
    void display() {
        int i;
        if (isEmpty()) {
          System.out.println("Empty Queue");
        }
        else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.println(queue[i]);

            System.out.println("\nRear index-> " + rear);
        }
    }
    
    int size(){
        if(isEmpty())
            return -1;
        else if(rear == front && front != -1)
            return 1;
        else{
            int x = (rear - front) + 1;
            return x;
        }
    }
}
