package queue;
public class Queue {

    public static void main(String[] args) {
    Queue_1 q = new Queue_1();

    // deQueue is not possible on empty queue
    q.deQueue();

    q.enQueue(10);
    q.enQueue(20);
    q.enQueue(30);
    q.enQueue(40);
    q.enQueue(50);
    q.enQueue(60);

    q.display();

    // deQueue removes element entered first i.e. 1
    q.deQueue();

    // Now we have just 4 elements
    q.display();
    System.out.println("Front element is :" + q.peek());
    System.out.println("Queue Is Empty : " + q.isEmpty());
    System.out.println("Queue Is Full : " + q.isFull());
    System.out.println("Number Of Elements in Queue :" + q.size());
    }
    
}
