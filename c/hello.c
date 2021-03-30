#include<stdio.h>
#include<stdlib.h>
/**
 * Node for a linked list
 * compiled by WASSWA ENOCK MALE from eno.Inc
*/
struct Node
{
    /* data */
    int data;
    struct Node* link;
};
// This is a global variable
struct Node* head;

// Definition of the functions
struct Node* Insert(struct Node* head,int x);
void Print(struct Node* head);
void delete(struct Node* head,int position);
struct Node* reverse(struct Node* head);
/*struct Node* */ void reversePrint(struct Node* head);
int main(){
    struct Node* head;
    head = NULL; //empty list;
    printf("How many numbers?\n");
    int n, i, x;
    scanf("%d",&n);
    for(i = 0; i < n; i++){
        printf("Enter a number \n");
        scanf("%d",&x);
        head = Insert(head,x);
        Print(head);
    }
    // head = Insert(head,2);
    // head = Insert(head,4);
    // head = Insert(head,6);
    // head =Insert(head,5);
    // head = Insert(head,19);
    // head = Insert(head,40);
    // head = Insert(head,67);
    // head =Insert(head,51);
    // Print(head);
    //delete node
    int k;
    printf("Enter a position\n");
    scanf("%d", &k);
    delete(head,k);
    Print(head);
    // reversing the list
    head = reverse(head);
    Print(head);
}

// Inserting the node at the beginning of the list
struct Node* Insert(struct Node* head, int x){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = x;
    temp->link = NULL;
    if(head == NULL){
        head = temp;
    }else{
        struct Node* temp1 = head;
        while(temp1->link != NULL){
            temp1 = temp1->link;
        }
        temp1->link= temp;
    }
    return head;
}

// Printing the list
void Print(struct Node* head){
    struct Node* temp = head;
    printf("List is: ");
    while(temp != NULL){
        printf("%d ",temp->data);
        temp = temp->link;
    }
    printf("\n");
}

void delete(struct Node* head, int position){
    // 1 -> 2 -> 3 -> 4
    // If removing a node
    struct Node* temp = head;
    if(position == 1){
        head = temp->link;
        free(temp);
    }else{
        for(int i = 0; i < position - 2; i++){temp = temp->link;}
        // temp points to n-1 th Node 
        struct Node* temp1 = temp->link; // nth Node
        temp->link = temp1->link; // (n+1) Node
        free(temp1);// Deleting the node
    }
}

// Reversing the linked list
struct Node* reverse(struct Node* head){
    // example reverse 1->2->3->4 to 4->3->2->1
   // Create three local variables of type struct Node
   struct Node *current, *prev, *tnext;
   prev = NULL;
   current = head;

   // Iterate to reverse the linkedlist
   while(current != NULL){
       tnext = current->link;
       current->link = prev;
       prev = current;
       current = tnext;
   }
   // changing the head to another point to the end of the first list
   head = prev;

   return head;
}

// Print in reverse ordererd
/* struct Node* */ 
// void reversePrint(struct Node* k){
//     if (k->link == NULL){
//         head = k;
//         return; 
//     }

//     reversePrint(k->link);
//     struct Node* q = k->link;
//     q->link = k;
//     k->data = NULL;
// }

// Romans 8:39 bible verse to read today