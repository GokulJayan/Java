#include <iostream>
#include<string.h>
using namespace std;

float area(float h, float b)
{
    return h*b;
}

float area(float t, float b, float h)
{
    return h*((t+b)/2);
}

float area(float r)
{
    return 3.14*r*r;
}

int main()
{
    int choice; float A;
    cout<<endl<<"1.Rectangle  2.Trapezoid  3.Circle"<<endl<<"Enter your choice: ";
    cin>>choice;
    
    if(choice==1)
    {
        float hR,bR;
        cout<<"Enter height of rectangle: ";
        cin>>hR;
        cout<<"Enter base of rectangle: ";
        cin>>bR;
        A=area(hR,bR);
    }
    else if(choice==2)
    {
        float tT,hT,bT;
        cout<<"Enter top of trapezoid: ";
        cin>>tT;
        cout<<"Enter bottom of trapezoid: ";
        cin>>bT;
        cout<<"Enter height of trapezoid: ";
        cin>>hT;
        A=area(tT,bT,hT);
    }
    else if(choice==3)
    {
        float rC;
        cout<<"Enter radius of circle: ";
        cin>>rC;
        A=area(rC);
    }
    else
    cout<<"Invalid Choice"<<endl<<endl;

    cout<<"Area: "<<A<<endl<<endl;
}
