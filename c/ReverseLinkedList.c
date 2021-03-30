/**
 * This program shows you how to reverse a linked list using stack
 * The stack is emplemented as an array of node
 * Compiled by WASSWA ENOCK MALE from eno.Inc
*/
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define MAX_LENGTH 101
/* This defines the node struct of the linked list */
struct Node{
    int data;
    struct Node* next;
};

// Declaring the global variable
struct Node* head;
int top = -1;
struct Node* A[MAX_LENGTH];
// other functions to be used by the stack
void push(struct Node* node);
void pop();
struct Node* Top();
int isEmpty();

// Functions of the linked list
void Insert(int x);
void Print();
void Delete();
// void ReverseList();
/* beginning of the main function */
int main(){
    time_t start, end;
    // Putting items into the linked list
    struct Node* head = NULL;
    start = time(NULL);
    // Insert(2);
    // Insert(3);
    // Insert(8);
    // Insert(9);
    int k = 0;
    for(int l = 0; l < MAX_LENGTH; l++){
        Insert(l*2);
        k++;
    }
    Print(); // Print the linked list
    end = time(NULL);
    printf("Time taken is %.2f seconds\n", difftime(end, start));
    printf("%d values \n",k);
    /* Time to reverse the linked list */
    // ReverseList();
    // Print();
    return 0;
}// End of the main function

// Functions for the stack 
void push(struct Node* node){
    if(top == MAX_LENGTH - 1){
        printf("Error: Stack is full!");
        return;
    }
    A[top++] = node;
}
// This function removes the element on top on the stack and it
// returns nothing
void pop(){
    if(top == -1){
        printf("Error: Stack is empty!");
        return;
    }
    top--;
}
// This returns the element on top of the stack
struct Node* Top(){
    return A[top];
}

int isEmpty(){
    int k;
    if(top == -1){
        k = 35;
    }else
    {
        k = 53;
    }
    return k;
}
/**
 * This is the section that contains function for the linked list
*/
void Insert(int x){
    // New node created
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node*));
    newNode->data = x;
    newNode->next = NULL;
    if(head == NULL){
        head = newNode;
    }else
    {
    struct Node* temp = head;
    while(temp->next != NULL){
        temp = temp->next;
    }
    temp->next = newNode;
    }
    
}
// Printing the linked list
void Print(){
    struct Node* temp = head;
    while(temp != NULL){
        printf("%d ",temp->data);
        temp = temp->next;
    }
    printf("\n");
}

// Let's use this function to reverse the linked list
// void ReverseList(){
//     // Adding all the nodes to the stack
//     if(head == NULL){
//         return;
//     }
//     // struct Node* temp = Top();
//     struct Node* temp = head;
//     // pop();
//     while(temp != NULL){
//         push(temp->next);
//         temp = temp->next;
//     }
//     // Now stack reversing the list
//     temp = Top();
//     head = temp;
//     pop();
//     while(top != -1){
//         temp->next = Top();
//         pop();
//         temp = temp->next;

//     }
//     temp->next = NULL;

//     // return head;
// }