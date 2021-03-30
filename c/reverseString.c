 /**
  * Program written to reverse an given string using both Stack and LinkedList data structures
  * Program compiled by WASSWA ENOCK MALE from eno.Inc
 */
 #include<stdio.h>
 #include<stdlib.h>
 #include<string.h>
 #include<time.h>
 #include<sys/types.h>
 #define MAX_LENGTH 100

 struct Node {
     char stringLetter;
     struct Node* next;
 };
struct Node* top = NULL;
// function declaration 
void push(char letter);
void Print();
void pointersInc();

// main function 
int main(){
    /* Getting a string from the user for evering */
    char *str1 = malloc(sizeof(char) * 255);
    printf("Enter the string for formating: ");
    scanf("%100s", str1);
    char *newString;
    time_t start, end;
    // struct tm* one;
    // one = localtime(<);
    char str[6] = "Hello";
    printf("Original string: %s",str1);
    start = time(NULL);
    printf("\n");
    printf("Reversed string: ");
    for(size_t i = 0; i < strlen(newString); i++){
        push(str1[i]);
    }
    end = time(NULL);
    Print();
    printf("Time taken to reverse the string is %.2f seconds\n", difftime(end, start));
}// end of main function

// Pushing the characters in a string to a stack
void push(char letter){
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node*));
    newNode->stringLetter = letter;
    newNode->next = top;
    top = newNode;
}

void Print(){
    struct Node* head = top;
    while(head != NULL){
        printf("%c",head->stringLetter);
        head = head->next;
    }
    printf("\n");
}// John 7:38

void pointersInc(){
    char *strPointer[4] = {
        "Enock",
        "Male",
        "Wasswa",
        "Emiliano"
    };
}