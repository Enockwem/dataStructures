public class DoublyLinkedList {
    NodeDL head;
    int data;

    DoublyLinkedList(){
        this.data = 0;
        this.head = null;
    }
    // Inserting data at the beginning of the node in doubly linked list
    public void InsertAtHead(int x){
        NodeDL newNode = new NodeDL(x, null, null);
        if(this.head == null){
            this.head = newNode;
            return;
        }
        this.head.prev = newNode;
        newNode.next = this.head;
        head = newNode;
    }

    public void InsertAtEnd(int x){
        NodeDL newNode = new NodeDL(x, null, null);
        if(this.head == null){
            head = newNode;
            return;
        }
        NodeDL temp = this.head;
        while(temp.next != null){
            temp = temp.next;
        }

        // After the loop, we are at the end of the list
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Display the list
    public void displayList(){
        NodeDL temp = this.head;
        // First check if the list is null
        if(temp == null){
            return;
        }
        while(temp != null){
            System.out.print(" "+temp+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display in the reverse order
    public void reverseDisplay(){
        NodeDL temp = this.head;
        if(temp == null){
            return;
        }

        // Go forward
        while(temp.next != null){
            temp = temp.next;
        }

        // While at the end of the list, print while going backwards
        while(temp != null){
            System.out.print(" "+temp+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.InsertAtHead(2); //doublyLinkedList.displayList();
        doublyLinkedList.InsertAtHead(4); //doublyLinkedList.displayList();
        doublyLinkedList.InsertAtHead(6); //doublyLinkedList.displayList();
        doublyLinkedList.InsertAtHead(8); //doublyLinkedList.displayList();

        doublyLinkedList.displayList();
        doublyLinkedList.InsertAtEnd(10);
        doublyLinkedList.InsertAtEnd(2);
        doublyLinkedList.displayList();

        doublyLinkedList.reverseDisplay();
    }
}
