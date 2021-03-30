package DataStructures.Queue;

public class QueueNode {
    public int data;
    public QueueNode link;

    public QueueNode(int key){
        this.data = key;
        this.link = null;
    }
}
