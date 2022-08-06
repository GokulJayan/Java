#include<iostream>
#include<conio.h>
#include<math.h>
using namespace std;

float distance(int x1, int y1, int x2, int y2)
{
    float d=sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    return d;
}

int main()
{
    int x1,y1,x2,y2;
    cout<<endl<<"Enter x-coordinate of 1st point: ";
    cin>>x1;
    cout<<"Enter y-coordinate of 1st point: ";
    cin>>y1;
    cout<<"Enter x-coordinate of 2nd point: ";
    cin>>x2;
    cout<<"Enter y-coordinate of 2nd point: ";
    cin>>y2;
    
    cout<<endl<<"Distance between 2 points: "<<distance(x1,y1,x2,y2)<<endl<<endl;
    return 0;
}