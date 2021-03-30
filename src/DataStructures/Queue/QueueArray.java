package DataStructures.Queue;

public class QueueArray {
    private static int front, rear, capacity;
    private static int queue[];

    QueueArray(int c){
        capacity = c;
        front = rear = 0;
        queue = new int[capacity];
    }

    static void enqueue(int data){
        if (capacity == rear){
            System.out.println("\nQueue is full\n");
            return;
        }else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    static void dequeue(){
        if (front == rear){
            System.out.println("\nQueue is empty\n");
            return;
        }else {
            for (int i = 0; i < rear - 1; i++){
                queue[i] = queue[i+1];
            }
            if (rear < capacity)
                queue[rear] = 0;

            rear--;
        }
        return;
    }

    static void display(){
        int i;
        if (front == rear){
            System.out.println("\nQueue is Empty\n");
            return;
        }
        for ( i = front; i < rear; i++){
            System.out.printf("%d <-- ",queue[i]);
        }
        return;
    }
    static void startOfQueue(){
        if (front == rear){
            System.out.println("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d",queue[front]);
        return;
    }

    public static void main(String[] args) {
        System.out.println("Implementing Queue using Array");
        QueueArray queue = new QueueArray(4);

        queue.display();

        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        queue.enqueue(60);

        queue.display();

        queue.dequeue();
        queue.dequeue();
        System.out.printf("\n\nafter two node deletion\n\n");

        queue.display();

        queue.startOfQueue();
    }
}
