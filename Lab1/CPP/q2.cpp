#include<iostream>
#include<conio.h>
using namespace std;

int sum(int n)
{
    int s=0,d;
    while(n>0)
    {
        d=n%10;
        s+=d;
        n=n/10;
    }
    return s;
}

int main()
{
    int n;
    cout<<endl<<"Enter a number: ";
    cin>>n;
    cout<<"Sum: "<<sum(n)<<endl<<endl;
    return 0;
}
