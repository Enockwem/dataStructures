/**
 * Implementing a stack data structure as a linked list
 * Implementing a stack by linked list helps not to limit the size of the stack as it is for the case of
 * implementing it by array
 * Since the operations of a stack take constant time for the worst case scenarios, we are going to add elements to 
 * the beginning/ head of the linked list.
 * compiled by WASSWA ENOCK MALE from eno.Inc
 */
public class StackAsLinkedList {
    Node head;
    int data;

    // Constructor for the StackAsLinkedList class
    StackAsLinkedList(){
        this.head = null;
        this. data = 0;
    }

    // stack functions/ operations 
    public void push(int x){
        Node newNode = new Node(x, this.head);
        // newNode.link = this.head;
        this.head = newNode;
    }


    public void pop(){
        Node temp = this.head;
        this.head = temp.link;
    }


    public int Top(){
        return this.head.data;
    }


    public Node TopNode(){
        return this.head;
    }


    public boolean isEmpty(){
        if(this.head == null){
            return true;
        }
        return false;
    }

    public void PushNode(Node value){
        value.link = this.head;
        this.head = value;
    }
    public void PrintStack(){
        if(this.head == null){
            System.out.println("Error: Stack is empty1");
            return;
        }
        Node temp = this.head;
        while(temp != null){
            System.out.print(" "+ temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }

    // public static void main(String[] args) {
    //     StackAsLinkedList stack = new StackAsLinkedList();
    //     for(int i = 0; i < 20; i++){
    //         Node newNode = new Node(i*i, null);
    //         stack.PushNode(newNode);
    //     }
    //     stack.PrintStack();
    //     System.out.println();
    // }
}
