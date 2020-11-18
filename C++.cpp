#include<iostream>
using namespace std;
int main()
{
    int N,i;
    cin>>N;
    if(N<10000)
    {
     for(i=2;i<=9999;i=i+N)
    {
       cout<<i<<endl;
    }
    }
    return 0;
}
