/**
 * This program uses stack Data structure to  check whether
 * parentheses of a given string value are closed or balanced
 * Program compiled by WASSWA ENOCK MALE from eno.Inc
 * SOLUTION:
 *      scan from left to right
 *      if opening symbol, add it to a list
 *      if closing symbol, remove last opening symbol in list
 * It uses Last unclosed, first closed
 * This uses constant time to do these processes
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>
#include<errno.h>

#define MAX_LENGTH 101

// Globla variables in c
char A[MAX_LENGTH];
int top = -1;

// functions for stack 
void push(char c);
void pop();
char Top();
int isEmpty();
void Print();
// CheckBalanced function for checking whether the parentheses
// are balanced
void CheckBalanced(char *str);

// main function begins 
int main(){
    char *str1 = "{([{}])}";
    size_t i;
    printf("String being checked is '");
    for(i = 0; i < strlen(str1); i++){
        printf("%c",str1[i]);
    }
    printf("'\n");
    CheckBalanced(str1);
    // int k = isEmpty();
    // if(k == 1){
    //     printf("True: %d\n",k);
    // }else{
    //     printf("False: %d\n",k);
    // }
}// end main

void push(char c){
    if(top == MAX_LENGTH-1){
        printf("Error: Overflow will occur!");
        return;
    }
    A[top++] = c;
}// end of push

void pop(){
    if(top == -1){
        printf("Error: Stack is empty!");
        return;
    }
    top--;
}// end of pop

int isEmpty(){
    if(top == -1){
        return 1;
    }
    else{
        return 0;
    }
}

// Printing the stack
void Print(){
    if(isEmpty() == 1){
        printf("Stack is empty\n");
    }
    for(int i = 0; i < top; i++){
        printf("%c ",A[i]);
    }
}

char Top(){
    return A[top];
}// end of Top
/**
 * Check whether the top is a closing parentheses
*/
char closingParentheses(char parentheses){
    if(parentheses == '}'){
        return '{';
    }else if(parentheses == ']'){
        return '[';
    }else if(parentheses == ')'){
        return '(';
    }else{
        return 'N';
    }
    
}
void CheckBalanced(char *str){
    // {()}
    size_t i;
    int k = 0;
    for(i = 0; i < strlen(str); i++){
        if(str[i] == '{' || str[i] == '(' || str[i] == '['){
            push(str[i]);//Print();
        }else
        {
            printf("Printing stack-> ");
            Print();
            printf("\n");
            char topChar = Top();
            // printf("Character on top %c \n",topChar);
            char closing = closingParentheses(str[i]);
            // The statement isEmpty() == 1 means that the stack is empty 
            if(isEmpty() == 1 || topChar != closing){
                // printf("They don't balance\n");
                printf("%c ",Top());
                // break;
                // k -= 1;
            }else{
                pop();
                // k += 1;
                // continue;
            }
        }
        
    }
    // if(k == strlen(str)/2){
    //     printf("They do balance\n");
    // }else
    // {
    //     printf("They don't match\n");
    // }
    
}