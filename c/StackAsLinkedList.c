/**
 * Implementing a stack data structure as a linked list
 * Since the operations of a stack take constant time for the worst case scenarios,
 * then we will be pushing to the beginning of the linked list, 
 * compiled by WASSWA ENOCK MALE from eno.Inc
 */
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<sys/socket.h>
struct Node {
    int data;
    struct Node* next;
};

struct Node* top = NULL; /*This is a global variable*/

void push(int x);
struct Node* Top();
void pop();
void Print();

// Beginning of the main function
int main(){
    // struct Node* top = NULL;
    // push(2);Print();
    // push(3);Print();
    // push(4);Print();
    // push(5);Print();
    // pop();Print();
    // pop();Print();
    // push(6);Print();
    // push(9);Print();
    for(int i = 0; i < 20; i++){
        push(i*i);
    }
    printf("Stack: ");
    Print();
    printf("Top ->  %d\n",top->data);
    push(67);Print();
    printf("New Top -> %d\n", top->data);
    
}// End of main

// Adding an element to the top of the stack
void push(int x){
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node*));
    newNode->data = x;
    newNode->next = top;
    top = newNode;
}

// Poping data from the top of the stack
void pop(){
    struct Node* temp = top;
    top = temp->next;
    free(temp);
}

// Printing a elements in a stack
void Print(){
    struct Node* head = top;
    while(head != NULL){
        printf("%d ", head->data);
        head = head->next;
    }
    printf("\n");
}

// Returning the top element on the stack
struct Node* Top(){
    // struct Node* head = top;
    return top;
}