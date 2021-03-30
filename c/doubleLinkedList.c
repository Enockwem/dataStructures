#include<stdio.h>
#include<stdlib.h>

/**
 * Node for a doubly linked list
 * It points to the next node and at the same time to the previous node.
 * compiled by WASSWA ENOCK MALE from eno.Inc
*/
struct Node
{
    int data;
    struct Node* next;
    struct Node* prev;
};

// global variable that points to the head node
struct Node* head;

// function declaration 
void InsertAtHead(int x);
void Print();
void ReversePrint();
struct Node* getNewData(int x);
void InsertAtEnd(int k);
void deleteNode(int position);
// Beginning of the main functio
int main(){
    head = NULL;
    InsertAtHead(2);
    InsertAtHead(4);
    InsertAtHead(8);
    InsertAtHead(19);
    InsertAtEnd(10);
    InsertAtEnd(19);

    // Print first list 
    printf("First List: ");
    Print();
    printf("\n");
    printf("This list is printed in reversed order: ");
    ReversePrint();
}// End of the main function

// function definition
struct Node* getNewData(int x){
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node*));
    // newNode->data = x;
    // newNode->next = NULL;
    // newNode->prev = NULL;
    // return &newNode;

    // or the method below 
    (*newNode).data = x;
    (*newNode).next = NULL;
    (*newNode).prev = NULL;

    return newNode;
}

void InsertAtHead(int y){
    struct Node* createdNode = getNewData(y);

    if(head == NULL){
        head = createdNode;
        return;
    }
    head->prev = createdNode;
    createdNode->next = head;
    head = createdNode;
}

void Print(){
    struct Node* temp = head;

    if(temp == NULL){
        return;
    }
    
    while(temp != NULL){
        printf(" %d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

void ReversePrint(){
    struct Node* temp = head;
    // check whether the list is empty
    if (temp == NULL)
    {
        return;
    }

    // First move forward to the last node of the list
    while(temp->next != NULL){
        temp = temp->next;
    }

    // After that, then print while going backwords
    while(temp != NULL){
        printf(" %d ",temp->data);
        temp = temp->prev;
    }
    printf("\n");
    
}

// Inserting at the end of the linked list
void InsertAtEnd(int k){
    // 1 -> 2 -> 9
    struct Node* newNode = getNewData(k);
    if(head == NULL){
        head = newNode;
        return;
    }
    struct Node* temp = head;
    while(temp->next != NULL){
        temp = temp->next;
    }
    temp->next = newNode;
    newNode->prev = temp;
}

// Deleting a node from a doubly linked list
void deleteNode(int position){
    /* code comes here */
    struct Node* temp = head;
    if(position == 1){
        head = temp->next;
        free(temp);
    }
    // 1 -> 2 -> 3:
    
}