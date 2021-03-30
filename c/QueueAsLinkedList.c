/**
 * Implementing a queue as a linked list
 * 
 * */ 
#include<stdio.h>
#include<stdlib.h>


typedef enum {true, false} boolean;
struct Node{
    int data;
    struct Node* next;
};

struct Node* front = NULL;
struct Node* rear = NULL;

// my function 
void enqueue(int x);
void dequeue();
int Front();
void Print();
// boolean isEmpty();

int main(){

    for(int i = 0; i < 20; i++){
        enqueue(i*i);
    }
    Print();
    printf("Front Node: %d \n",Front());
}

void enqueue(int x){
    struct Node* temp = (struct Node*) malloc(sizeof(struct Node*));
    temp->data = x;
    temp->next = NULL;
    if (front == NULL && rear == NULL)
    {
        front = temp;
        rear = temp;
        return;
    }
    rear->next = temp;
    rear = temp;
}

void dequeue(){
    if(front == NULL){
        return;
    }else
    {
        struct Node* temp = front;
        front = temp->next;
    }
    
}
// This method returns the front node
int Front(){
    return front->data;
}

// This Print function prints the nodes in a queue
void Print(){
    if(front == NULL && rear == NULL){
        printf("The queue is empty!\n");
        return;
    }
    struct Node* temp = front;
    while(temp != NULL){
        printf("%d ",temp->data);
        temp = temp->next;
    }
    printf("\n");
}