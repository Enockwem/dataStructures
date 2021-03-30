/**
 * Using circular array in Queue data structures to make sure that when a dequeue is performed,
 * the arrays before the front after the dequeue can be used again
 * In a circular array, all cells of the array are used and reused.
 * the science of (i + 1)%N create the theory of the circular array
*/
#include<stdio.h>
#include<stdlib.h>

#define MAX_LENGTH 101

int arr[MAX_LENGTH];
int rear = -1;
int front = -1;

typedef enum {true, false} boolean;

void enqueue(int x);
boolean isEmpty();
void dequeue();
int Front();
void Print();

int main(){
    for(int i = 1; i < 26; i++){
        enqueue(i*2);
    }
    Print();
    int k = 5;
    while(k > 0){
        dequeue();
        k--;
    }
    printf("\n");
    printf("After deque\n");
    Print();
    printf("\n");
    printf(" Added on values to check whether the circular array works\n");
    int l = 8;
    while (l > 0)
    {
        enqueue(l*10);
        l--;
    }
    Print();
    return 0;
}// end main function
boolean isEmpty(){
    if(rear == -1 && front == -1){
        return true;
    }else
    {
        return false;
    }
    
}
void enqueue(int x){
    if((rear + 1) % MAX_LENGTH == front){
        return;
    }else if(isEmpty() == true){
        rear = 0;
        front = 0;
    }else
    {
        rear = (rear + 1)%MAX_LENGTH;
    }
    arr[rear]=x;
}


void dequeue(){
    if(isEmpty() == true){
        return;
    }else if(front == rear){
        rear = -1;
        front = -1;
    }else
    {
        front = (front + 1)%MAX_LENGTH;
    }
    
}

// Returning the front element in the queue, since the queue is a FIFO operator, 
// then the fuction below will return the element the entered the queue first which is the front:
int Front(){
    return arr[front];
}

// Print the queue
void Print(){
    if(isEmpty() == true){
        printf("The queue is empty!\n");
        return;
    }else
    {
        for(int i = front; i <= rear; i++){
            printf("%d ", arr[i]);
        }
        printf("\n");
    }
    
}