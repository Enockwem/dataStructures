package DataStructures.doublelLinkedList;

public class Node {
    public int data;
    public Node next;
    public Node prev;

    Node(){
        this.data = 0;
    }

    Node(int n, Node next, Node prev){
        this.data = n;
        this.next = next;
        this.prev = prev;
    }
}
