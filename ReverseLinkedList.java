/**
 * This program shows you how to reverse a linked list using stack
 * The stack is emplemented as an array of node
 * Compiled by WASSWA ENOCK MALE from eno.Inc
*/

public class ReverseLinkedList {
    Node head;
    int data;
    StackAsLinkedList S;

    ReverseLinkedList(){
        this.data = 0;
        this.S = new StackAsLinkedList();
        this.head = null;
    }

    // This operation inserts a node at the end of the linked list
    public void Insert(int x){
        Node newNode = new Node(x, null);
        if(this.head == null){
            head = newNode;
        }else{
            Node temp = this.head;
            while(temp.link != null){
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    public void Print(){
        if(this.head == null){
            System.out.println("Linked list empty!");
            return;
        }
        Node temp = this.head;
        while(temp != null){
            System.out.print(" "+temp.data);
            temp = temp.link;
        }
    }

    public void ReverseLinkedListUsingStack(){
        // StackAsLinkedList S;
        if(this.head == null){
            System.out.println("List is empty");
            return;
        }
        // Pushing all the links to the stack
        Node temp = this.head;
        
        while(temp != null){
            this.S.PushNode(temp.link);
            temp = temp.link;
        }
        // this.S.PrintStack();
        // Now time to reverse a linked list
        temp = this.S.TopNode();
        head = temp;
        this.S.pop();
        while(this.S.isEmpty() != true){
            temp.link = this.S.TopNode();
            this.S.pop();
            temp = temp.link;
        }
        temp.link = null;
    }
    public static void main(String[] args) {
        // System.getProperty(key)
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        for(int i = 0; i < 24; i++){
            reverseLinkedList.Insert(i*i);
        }
        reverseLinkedList.Print();
        reverseLinkedList.ReverseLinkedListUsingStack();
        // reverseLinkedList.Print();
    }
}
