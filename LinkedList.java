package linkedlist_1;
public class LinkedList {
    Node head;
    Node tail;
    int n;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.n = 0;
        
    }

    public LinkedList(Node head, Node tail, int n) {
        this.head = head;
        this.tail = tail;
        this.n = n;
    }
    
    
    
    public int get(int i){
        Node c = new Node();
        c = head;
        for(int j = 0; j < i; j++)
            c = c.next;
        return c.value;
    }
    
    ////////////////////////////////////////////////
    
    public void set(int i, int v){
        Node c = new Node();
        c = head;
        for(int j = 0; j < i; j++)
            c = c.next;
        c.value = v;
    }
    
    ////////////////////////////////////////////////
    
    public void addFirst(int v){
        Node newN = new Node();
        newN.value = v;
        if(head==null){
            head = tail = newN;
        }
        else{
            newN.next = head;
            head = newN;
        }
        n++;
    }
    
    ////////////////////////////////////////////////
    
    public void addLast(int v){
        Node newN = new Node();
        newN.value = v;
        if(head==null){
            head = tail = newN;
        }
        else{
            tail.next = newN;
            tail = newN;
        }
        n++;
    }
    
    ////////////////////////////////////////////////
    
    public void insert(int v, int i){
        Node newN = new Node(), c = new Node();
        newN.value = v;
        if(head==null){
            head = tail = newN;
        }
        else{
            c = head;
            for(int j = 0; j < i-1; j++)
                c = c.next;
            newN.next = c.next;
            c.next = newN;
        }
        n++;
    }
    
    ////////////////////////////////////////////////
    
    public void display(){
        Node c = new Node();
        c = head;
        for(int i = 0; i < n; i++){
            System.out.println(c.value);
            c = c.next;
        }
    }
    
    ////////////////////////////////////////////////
    
    public void deleteFirst(){
        head = head.next;
        n--;
    }
    
    ////////////////////////////////////////////////
    
    public void deleteLast(){
        Node c = new Node();
        c = head;
        for(int i = 0; i < n-1; i++){
            c = c.next;
        }
        tail = c;
        tail.next = null;
        n--;
    }
    
    ////////////////////////////////////////////////
    
    public void delete(int indx){
        Node c = new Node();
        c = head;
        for(int i = 0; i < indx-1; i++){
            c = c.next;
        }
        c.next = c.next.next;
        n--;
    }
    
    ////////////////////////////////////////////////
    
    public int indexOf(int v){
        Node c = new Node();
        c = head;
        for(int i = 0; i < n; i++){
            if(c.value == v)
                return i;
            
            c = c.next;
        }
        return -1;
    }
}
