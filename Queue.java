/**
 * Implementing a queue using circular array in java
 * work compiled by WASSWA ENOCK MALE @ 
 */
public class Queue {
    int MAX_LENGTH;
    int[] arr;
    int front;
    int rear;

    Queue(){
        this.MAX_LENGTH = 101;
        this.arr = new int[MAX_LENGTH];
        this.front = -1;
        this.rear = -1;
    }
    public boolean isEmpty(){
        if(front == -1 &&  rear == -1){
            return true;
        }
        return false;
    }

    // Using a circular array to insert elements to the Queue
    public void Enqueue(int x){
        // The first if checks whether the circular array is already full
        // if the next position = front, then the circular array is full
        // next postion = (rear + 1)%N, whether N is the length of the array
        if((rear +1)%MAX_LENGTH == front){
            // If the circular array is full, then
            // stop and just return out of the method
            return;
        }else if(isEmpty()){
            front= 0;
            rear = 0;
        }else{
            rear = (rear + 1)%MAX_LENGTH;
        }
        arr[rear]=x;
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Error: Queue is empty!");
            return;
        }else if(front == rear){
            front = -1;
            rear = -1;
        }else{
            front = (front + 1)%MAX_LENGTH;
        }
    }

    public int Front(){
        return arr[front];
    }

    public void Print(){
        if(isEmpty() == true){
            System.out.println("The queue is empty!");
            return;
        }else{
            for(int i = front; i <= rear; i++){
                System.out.print(" "+arr[i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.dequeue();
        // queue.Print();
        // for(int k = 0; k < 101; k++){
        //     queue.Enqueue(k*k);
        // }
        // queue.Print();
        // int o = 10;
        // while(o > 0){
        //     queue.dequeue();
        //     o--;
        // }
        // queue.Enqueue(1);
        // System.out.println();
        // System.out.print("After Dequeuing: ");
        // queue.Print();
        // System.out.println();
        // System.out.println("Then add items to check whether the circular array works");  
    //     int y = 5;
    //     while(y > 0){
    //         queue.Enqueue(y*y);
    //         y--;
    //     }
    //     queue.Print();
    }
}
