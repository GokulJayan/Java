#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
    float w,h,bmi;
    cout<<endl<<"Enter your weight in kg: ";
    cin>>w;
    cout<<"Enter your haight in meters: ";
    cin>>h;
    bmi=w/(h*h);
    cout<<"Calculated BMI: "<<bmi<<endl;
    
    cout<<"Interpretation: ";
    if(bmi<16)
    cout<<"Serious underweight";
    else if(bmi<18)
    cout<<"Underweight";
    else if(bmi<24)
    cout<<"Normal weight";
    else if(bmi<29)
    cout<<"Overweight";
    else if(bmi<35)
    cout<<"Seriously overweight";
    else
    cout<<"Gravely overweight";

    cout<<endl<<endl;
    return 0;
}
