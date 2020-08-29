package DataStructures.stack;

import java.util.EmptyStackException;

public class ArrayImplementation {
    private int array[];
    private int size;
    private int index = 0;

    // Constructor with an argument of the size for stack implementation
    public ArrayImplementation(int size){
        this.size = size;
        array = new int[size];
    }

    // Pushing an item to the stack
    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack is full");
        }
        array[index] = element;
        index++;
    }

    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return array[--index];
    }

    public int peek(){
        if (isEmpty())
            throw new EmptyStackException();
        int peekIndex = index - 1;
        return array[peekIndex];
    }

    public boolean isEmpty(){
        if (index == 0)
            return true;
        return false;
    }

    public boolean isFull(){
        if (index == size)
            return true;
        return false;
    }

    public int size(){
        return index;
    }

    public static void main(String[] args) {
        System.out.println("Implementation of stack ADT using Arrays...");
        ArrayImplementation stack = new ArrayImplementation(10);
        System.out.println("1. Pushing Elements on to the stack");

        for (int i = 10; i > 0; i--)
            stack.push(i);

        System.out.println("2. Size of stack after push operations : " + stack.size());
        System.out.println("3. Peek of stack after push operations: " + stack.peek());

        System.out.printf("4. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n5. Size of stack after pop operations : " + stack.size());
    }
}
