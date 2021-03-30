/**
 * This is an array implementation of a stack, 
 * A stack is a LIFO kinder implementation
 * 
 * compiled by @wasswa enock male from eno.Inc
 */
public class Stack {
    int MAX_SIZE = 101;
    int top;
    int[] A;
    Stack(){
        this.top = -1;
        this.A = new int[MAX_SIZE];
    }
    
    // Pushing elements to a stack
    public void Push(int x){
        if(top == MAX_SIZE - 1){
            System.out.println("Error: Stack is full!");
            return;
        }
        A[top++] = x;
    }

    // Poping an item from the stack
    public void Pop(){
        if(top == -1){
            System.out.println("Error: stack is empty");
            return;
        }
        top--;
    }

    // Showing the top element on the stack
    public int Top(){
        return A[top];
    }

    // Check whether the stack is empty
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
}
