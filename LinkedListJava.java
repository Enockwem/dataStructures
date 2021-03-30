public class LinkedListJava {
    Node A;
    int data;
    LinkedListJava(){
        this.data = 0;
        this.A = null;
    }

    // Adding an Item to the front of the Linked list
    private void adding_node_at_the_end_of_the_list(int addingdata){
        // Adding data to the LinkedList
        // Literally, adding data to the end of the linkedlist
        Node temp = new Node(addingdata, null);
        if(this.A == null){
            this.A = temp;
        }
        Node temp1 = new Node(addingdata, null);
        Node m = this.A;
        while(m.link != null){
            m = m.link;
        }
        m.link =    temp1;
    }



    // Inserting the node at the beginnig of the list
    public void add_node_to_the_beginning(int addingData){
        Node temp1 = new Node(addingData, null);
        if(this.A != null){
            temp1.link = this.A;
        }
        A = temp1;
    }


    // Inserting a node at the nth position in the list
    public void addtoNthPosition(int addingData, int position){
        // Say you are adding to position 2, of list -> 10,11,13
        Node temp = new Node(addingData, null);
        if(position == 1){
            temp.link = this.A;
            this.A = temp;
            return;
        }

        Node temp2 = this.A;
        for(int i = 0; i < position -2; i++){
            temp2 = temp2.link;
        }
        temp.link = temp2.link;
        temp2.link = temp;
        
    }
    // Traversing the linked list in java
    public void displayList(){
        Node k = this.A;
        while(k.link != null){
            System.out.print(k.data);
            System.out.print(" -> ");
            k = k.link;
        }
        System.out.println("End of the list");
    }

    public void deleteNode(int position){
        // 1->2->3->4
        // Deleting the first node codition
        Node temp1 = this.A;
        if(position == 1){
            // Change the link of this.A to the link of temp1.link
            // This is more of swapping
            this.A = temp1.link;
        }
        for(int i = 0; i < position-2; i++){
            // Now make temp1 point to the (n-1)th node
            temp1 = temp1.link;
        }
        // Node that am deleting 
        Node temp2 = temp1.link;
        temp1.link = temp2.link;
        // then free space of temp2
    }

    // Printing the list using recursion
    public void Printrecursion(Node l){
        if(l.link == null){
            return;
        }
        System.out.print(l.data+" -> ");
        Printrecursion(l.link);
    }

    // Printing the list in reverse using recursion
    public void PrintReverseRecursion(Node l){
        if(l.link == null){
            return;
        }
        PrintReverseRecursion(l.link);
        System.out.print(l.data+" -> ");
    }

    public void Precursioin(){
        Printrecursion(this.A);
    }
    public void ppReverse(){
        PrintReverseRecursion(this.A);
    }

    // Reverse using recursion
    public void ReverseRecursion(Node k){
        if(k.link == null){
            this.A = k;
        }
        ReverseRecursion(k.link);
        Node m = k.link;
        m.link = k;
        k.link = null;
    }

    public static void main(String[] args) {
        LinkedListJava list1 = new LinkedListJava();
        LinkedListJava list2 = new LinkedListJava();
        LinkedListJava list3 = new LinkedListJava();
        // Adding data to the end of the list
        System.out.println("Adding to the end of the list");
        for(int i = 1; i < 10; i++){
            list1.adding_node_at_the_end_of_the_list(i*i);
        }
        list1.adding_node_at_the_end_of_the_list(35);
        list1.adding_node_at_the_end_of_the_list(90);
        list1.displayList();

        // Adding data to the beginning of the list
        System.out.println("Adding data to the beginning of the list");
        for(int i = 1; i < 10; i++){
            list2.add_node_to_the_beginning(i);
        }
        list2.add_node_to_the_beginning(100);
        list2.deleteNode(3);
        list2.displayList();

        // Inserting the data to the nth position
        System.out.println("Adding data to the nth position");
        list3.addtoNthPosition(2, 1);
        list3.addtoNthPosition(3, 2);
        list3.addtoNthPosition(4, 1);
        list3.addtoNthPosition(5, 2);
        list3.deleteNode(2);
        list3.displayList();

        list3.Precursioin();
        list3.ppReverse();
    }
}
