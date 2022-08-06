#include<stdio.h>

int mutex=1;
int full=0;
int empty=10;

void producer()
{
    if ((mutex == 1) && (empty != 0)) 
    {
        mutex--;
        empty--;
        full++;    
        printf("-----Producing Item-----"); 
        mutex++;
    }
    else
    printf("Buffer is full!");
}

void consumer()
{
    if ((mutex == 1) && (full != 0)) 
    {
        mutex--;
        empty++;
        full--; 
        printf("-----Consuming Item-----");  
        mutex++;
    }
    else
    printf("Buffer is empty!");
}


void main()
{
    int ch;
    while(1)
    {
        printf("\n\n1.Produce  2.Consume  3.Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &ch);
        
        if(ch==1)
        producer();
        
        else if(ch==2)
        consumer();
        
        else
        break;
    }
}
