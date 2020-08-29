package DataStructures.Queue;

public class QueueLinkedList {
    QueueNode front, rear;

    public QueueLinkedList(){
        this.front = this.rear = null;
    }

    void enqueue(int key){
        QueueNode node = new QueueNode(key);
        if (this.rear == null){
            this.front = this.rear = node;
            return;
        }
    }
    QueueNode dequeue(){
        if (this.front == null)
            return null;
        QueueNode node = this.front;
        this.front = this.front.link;

        if (this.front == null)
            this.rear = null;
        return node;
    }

    void display(){
        if (this.front == null)
            System.out.println("");
        QueueNode node = this.front;
        while (node != null){
            System.out.print(node.data + " -> ");
            node = node.link;
        }
    }

    public static void main(String[] args) {
        System.out.println("Implementing Queue Using LinkedList\n");
        QueueLinkedList qUsingLinkedList = new QueueLinkedList();
        qUsingLinkedList.enqueue(10);
        qUsingLinkedList.enqueue(20);
        System.out.println("\nQueue After Enqueue Operation\n");
        qUsingLinkedList.display();
        qUsingLinkedList.dequeue();
        qUsingLinkedList.dequeue();
        System.out.println("\nQueue After Dequeue Operation\n");
        qUsingLinkedList.display();
        qUsingLinkedList.enqueue(30);
        qUsingLinkedList.enqueue(40);
        qUsingLinkedList.enqueue(50);
        System.out.println("\nQueue After Enqueue Operation\n");
        qUsingLinkedList.display();
        System.out.println("De queued item is " + qUsingLinkedList.dequeue().data);
    }
}
