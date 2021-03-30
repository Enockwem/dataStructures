#include<stdio.h>
#include<limits.h>
void main()
{ 
    /* variables and data types in c*/
    int age;
    char enock;
    enock = 'k';
    unsigned char me;
    signed char n;
    int b;
    unsigned int e;
    short h; 
    unsigned short j;
    long v;
    unsigned long s;
    me='u';
    age=7;
    printf("storage size for int: %ld \n" , sizeof(int));
    printf("storage size for char: %ld\n" , sizeof(char));
    int one = 9;
    float two = 16.7;
    double three = 0.0045;
    double average = (one + two)/three;
    printf("%f\n",average);

}