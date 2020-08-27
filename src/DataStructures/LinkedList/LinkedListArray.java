package DataStructures.LinkedList;
/*
Linked List is in style 12->28->11->null
Linked list is the data structure which can overcome all the limitations of an array.
Using linked list is useful because,It allocates the memory dynamically.
All the nodes of linked list are non-contiguously stored in the memory and linked together with the help of pointers.
Sizing is no longer a problem since we do not need to define its size at the time of declaration.
List grows as per the program’s demand and limited to the available memory space.
In the following sections we will discuss the common operations supported by LinkedList Data Structure
 */
public class LinkedListArray {
    protected Node end;
    public int size;
    protected Node start;

    public LinkedListArray(){
        start = null;
        end = null;
        size = 0;
    }

    // Check whether the linkedList is empty
    public boolean isEmpty(){
        return start == null;
    }
    // Check size of the linkedList
    public int getSize(){
        return size;
    }

    // Inserting a Node at a List
    public void insertBegining(int val){
        Node node = new Node(val,null);
        size++;
        if (start == null){
            start = node;
            end = start;
        }else {
            node.link=node;
            start = node;
        }
    }

    public void insertEnd(int val){
        Node node = new Node(val, null);
        size++;
        if (start == null){
            start = node;
            end = start;
        }else {
            end.setLink(node);
            end = node;
        }
    }

    public void insertAtPosition(int val, int pos){
        Node node = new Node(val, null);
        Node ptr = start;
        pos = pos - 1;
        for (int i = 0; i < size; i++){
            if (i == pos){
                Node node1 = ptr.getLink();
                ptr.setLink(node);
                node.setLink(node1);
                break;
            }
            ptr = ptr.getLink();
        }
        size++;
    }

    public void deleteAtPos(int pos){
        if (pos == 1){
            start = start.getLink();
            size--;
            return;
        }
        if (pos == size){
            Node s = start;
            Node t = start;
            while (s != end){
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size--;
            return;
        }
        Node ptr = start;
        pos = pos - 1;
        for (int i = 1; i < size- 1; i++){
            if (i == pos){
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size --;
    }

    public void display(){
        System.out.print("\n Linked List = ");
        if (size == 0){
            System.out.print("empty\n");
            return;
        }
        if (start.getLink() == null){
            System.out.println(start.getData());
            return;
        }
        Node ptr = start;
        System.out.print(start.getData()+"->");
        ptr = start.getLink();
        while (ptr.getLink() != null){
            System.out.print(ptr
            .getData() +"->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+"\n");
    }

    // Main method
    public static void main(String[] args) {
        LinkedListArray linkedListArray = new LinkedListArray();
        System.out.println("Linked List Operation");
        int[] arr = {12,9,100};

        System.out.print("Start inserting operation on Linked List\n");
        System.out.print("Inserting arr elements in Linked List \n");
        linkedListArray.insertBegining(arr[0]);
        linkedListArray.insertEnd(arr[arr.length-1]);
        System.out.println("Linked List after the Insert operation");
        linkedListArray.display();
        System.out.print("Deleting elements in Binary Search Tree\n");
        for (int i = 0; i < arr.length; i++){
            linkedListArray.deleteAtPos(i);
        }
        System.out.println("Linked List  after the delete operation");
        linkedListArray.display();
    }
}
