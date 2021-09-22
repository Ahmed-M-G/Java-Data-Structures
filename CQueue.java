package circular_queue;
public class CQueue {
    static final int MAX = 1000;
    int front, rear, cQueue[] = new int[MAX];
    
    public CQueue() {
        front = -1;
        rear = -1;
    }
    
    boolean isFull(){
        return ((rear+1)%MAX == front);
    }
    
    boolean isEmpty(){
        return (front == -1 && rear == -1 );
    }
    
    void enQueue(int n){
        if(isFull())
            System.out.println("CQueue Is Full");
        else{
            if(front == -1)
                front = 0;
            
            rear = (rear+1) % MAX;
            cQueue[rear] = n;
            System.out.println("Inserted " + n);
        }
    }
    
    int deQueue(){
        if(isEmpty()){
            System.out.println("CQueue Is Empty");
            return -1;
        }
        else{
            int x = cQueue[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else
                front = (front + 1) % MAX;
            return x;
        }
    }
    
    int peek(){
        if (isEmpty()) {
            System.out.println("CQueue Is Empty");
            return -1;
        }
        else{
            int x = cQueue[front];
            return x;
        }
    }
    
    int size(){
        int x;
        if(isEmpty())
            return -1;
        else if(rear == front && front != -1)
            return 1;
        else if(rear > front){
            x = (((rear+1)%MAX) - ((front+1)%MAX));
            return x;
        }
        else{
            x = (MAX - front) + rear + 1;
            return x;
        }
    }
    
    void display() {
    /* Function to display status of Circular Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % MAX)
                System.out.println(cQueue[i]);
            System.out.println(cQueue[i]);
            System.out.println("Rear -> " + rear);
        }
  }
}
