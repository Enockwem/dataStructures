/**
 * Implementing a queue as Linked list in java, 
 * it contains the front/head and the rear/tail. 
 * Items are enqueued to the rear(this helps keeping the operation of adding data to have a constant time O(1))
 * Items are dequeued from the front
 */
public class QueueAsLinkedList {
    Node front;
    Node rear;

    QueueAsLinkedList(){
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty(){
        if(this.front == null && this.rear == null){
            return true;
        }
        return false;
    }

    public void Enqueue(int x){
        // Create the node
        Node newNode = new Node(x, null);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
            return;
        }
        rear.link = newNode;
        rear = newNode;
    }

    public void Dequeue(){
        if(isEmpty()){
            return;
        }
        front = front.link;
    }


    public void Print(){
        if(isEmpty()){
            System.out.println("The queue is empty!");
            return;
        }
        Node temp = front;
        while(temp != null){
            System.out.print(" "+temp.data);
            temp = temp.link;
        }
        System.out.println();
    }

    public int Front(){
        return front.data;
    }

    public static void main(String[] args) {
        QueueAsLinkedList queueAsLinkedList = new QueueAsLinkedList();
        for(int i = 0; i < 50; i++){
            queueAsLinkedList.Enqueue(i*i);
        }
        queueAsLinkedList.Print();
        System.out.println();
        System.out.print("Dequeue: ");
        int l = 10;
        while(l > 0){
            queueAsLinkedList.Dequeue();
            l--;
        }
        queueAsLinkedList.Print();
        System.out.println();
        System.out.print("Add on a few items: ");
        while(l < 5){
            queueAsLinkedList.Enqueue(l*l);
            l++;
        }
        queueAsLinkedList.Print();
    }
}