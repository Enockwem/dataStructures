#include<stdio.h>
// #include<stdbool.h>
#include<stdlib.h>

// using enum to declare boolean
typedef enum {false, true} boolean;
boolean IsOpeningParentheses(char k);

int main(){
    // if(IsOpeningParentheses(')') == true){
    //     printf("It's an openning parentheses\n");
    // }else{
    //     printf("It's a closing parentheses\n");
    // }
}

boolean IsOpeningParentheses(char k){
    if(k == '('){
        return true;
    }else if(k == '{'){
        return true;
    }else if(k == '['){
        return true;
    }else
    {
        return false;
    }
    
}