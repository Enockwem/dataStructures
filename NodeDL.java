// This node is for the doubly linked list since it has three properties
// the data field, the next/link field, and the prev_link field
public class NodeDL {
    int data;
    NodeDL next;
    NodeDL prev;

    NodeDL(int data, NodeDL next, NodeDL prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
