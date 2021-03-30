/**
 * implementing a stack using an array in c
 * compiled by WASSWA ENOCK MALE from eno.Inc
*/
#include<stdio.h>
#define MAX_SIZE 101
int A[MAX_SIZE];
int top = -1;

// declare the functions for the stack
void push(int x);
void pop();
void Print();
int Top();

// Beginning of the main function

int main(){
    int k = Top();
    // Print();
    push(2);Print();
    push(3);Print();
    push(4);Print();
    push(5);Print();
    pop();Print();
    pop(); Print();
}

// define the functions for the stack operations
// push operation, to add items to the stack
void push(int x){
    if(top == MAX_SIZE -1){
        printf("Error! overflow will occur. Stack full");
        return;
    }
    A[top++]=x;
}

// This operation below, removes the top most element from the stack
void pop(){
    if(top == -1){
        printf("!Error: Stack is empty");
        return;
    }
    top--;
}
// This returns the element at the top of the stack
int Top(){
    if(top == -1){
        printf("Error: Stack is empty!");
        return -1;
    }
    return A[top];
}

// Printing the stack elements
void Print(){
    if(top == -1){
        printf("Error: Stack is empty!");
        return;
    }
    // If the stack is not empty
    for(int i = 0; i < top; i++){
        printf(" %d ", A[i]);
    }
    printf("\n");
}