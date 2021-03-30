package DataStructures.stack;

import static java.lang.System.exit;

public class LinkedListImplementation {
    Node top;

    LinkedListImplementation(){
        this.top = null;
    }

    public void push(int x){
        Node node = new Node();

        if (node == null){
            System.out.println("\nHeap Overflow");
            return;
        }

        node.data = x;
        node.link = top;
        top = node;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        if (!isEmpty())
            return top.data;
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public void pop(){
        if (top == null){
            System.out.println("\nStack Underflow");
            return;
        }
        top = (top).link;
    }
    public void display(){
        if (top == null){
            System.out.println("\nStack underflow");
            exit(1);
        }else{
            Node temp = top;
            while (temp != null){
                System.out.printf("%d-> ",temp.data);

                temp = temp.link;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Implementing Stacks Using LinkedList");
        LinkedListImplementation obj = new LinkedListImplementation();
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek());

        obj.pop();
        obj.pop();

        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek());
    }
}
