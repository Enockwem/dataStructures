#include<stdio.h>
#include<stdlib.h>

#define MAX_LENGTH 101
// declare global variables 
int arr[MAX_LENGTH];
int rear, front = -1;

// declare a boolean enum
typedef enum {true, false} boolean;

// Queue operations
boolean IsEmpty();
void enqueue(int x);
void dequeue();
boolean Isfull();
int Front();
void Print();

int main(){
  for(int i = 0; i < MAX_LENGTH; i++){
      enqueue(i*i);
  }
  Print();
  int k = 10;
  printf("\n");
  printf("After the deque\n");
  while (k > 0)
  {
      dequeue();
      k--;
  }
  Print();
  
}// end main

boolean Isfull(){
    if (rear == 100)
    {
        return true;
    }
    return false;
}
boolean IsEmpty(){
    if(rear == -1 && front == -1){
        return true;
    }else
    {
        return false;
    }
   
}

void enqueue(int x){
    if(Isfull() == true){
        return;
    }else if(IsEmpty() == true){
        rear = 0; front = 0;
    }else
    {
        rear += 1;
    }
    arr[rear] = x;
}

void Print(){
    if(IsEmpty() == true){
        return;
    }else{
        for(int i = front; i <= rear; i++){
            printf("%d ",arr[i]);
        }
        printf("\n");
    }
}

void dequeue(){
    if(IsEmpty() == true){
        return;
    }else if(front == rear)
    {
        front, rear = -1;
    }else
    {
        front = front + 1;
    }
}

int Front(){
    return arr[front];
}