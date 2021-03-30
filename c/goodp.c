#include <stdio.h>
int main(){
    // /*Hello World*/
    // printf("Hello World");
    // return 70;

    // int A = 120;
    // int B = 13;
    // int C = A & B;
    // printf("%d", C);
    // return 0;

    unsigned int a = 60;
    unsigned int b = 13;
    int c = 0;

    c = a & b;
    printf("Line 1 value of c is %d\n",c );
    c = a | b;
    printf("Line 2 value of c is %d\n", c);
    c = a ^ b;
    printf("Line 3 value of c is %d\n",c);
    c = -a;
    printf("Line 4 value of c is %d\n", c);
    c = a << 2;
    printf("Line 5 value of c is %d\n", c);
    c = a >> 2;
    printf("Line value of c is %d\n", c);
    return 0;
} 