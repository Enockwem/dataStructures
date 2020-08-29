package DataStructures.doublelLinkedList;

import java.util.NoSuchElementException;

public class DoublelyLinkedList {
    private Node head;
    private Node tail;
    public int size;

    // Constructor with no arguments
    public DoublelyLinkedList(){
        size = 0;
    }
    // Return the size of the doubly linked list
    public int size(){
        return size;
    }

    // Check whether the doubly linked list is empty
    public boolean isEmpty(){
        boolean checkValue = false;
        if (size == 0){
            checkValue = true;
        }
        return checkValue;
    }
    // Adding an item
    public void addFirst(int element){
        Node node = new Node(element,head,null);
        if (head != null){
            head.prev = node;
        }
        head = node;
        if (tail == null){
            tail = node;
        }
        size++;
        System.out.println("adding: "+ element);
    }

    //Adding an item last
    public void addLast(int element){
        Node node = new Node(element,head, tail);
        if (tail != null){
            tail.next = node;
        }
        tail = node;
        if (head == null){
            head = node;
        }
        size++;
        System.out.println("adding: "+element);
    }

    // Traversing Forward
    public void traverseForward(){
        System.out.println("Traversing forward..");
        Node tmp = head;
        while (tmp.next != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    // Traversing Back word
    public void traverseBackward(){
        System.out.println("Traversing back ward.....");
        Node node = tail;

        while (node.prev != null){
            System.out.println(node.data);
            node = node.prev;
        }
    }

    // remove the first element
    public int removeFirst(){
        if (size == 0)
            throw new NoSuchElementException();
        Node node = head;
        head = head.next;
        head.prev = null;
        size --;

        System.out.println("deleted: "+node.data);

        return node.data;
    }

    public int removeLast(){
        if (size == 0)
            throw new NoSuchElementException();

        Node node = tail;
        tail = tail.prev;
        tail.next = null;

        size--; // Reduce size
        System.out.println("deleted: "+node.data);

        return node.data;
    }

    public static void main(String[] args) {
        DoublelyLinkedList dll = new DoublelyLinkedList();
        dll.addFirst(10);
        dll.addFirst(34);
        dll.addLast(56);
        dll.addLast(364);
        dll.traverseForward();
        dll.removeFirst();
        dll.removeLast();
        dll.traverseBackward();
    }
}
