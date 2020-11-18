#include<stdio.h>
int main()
{
    int i,N;
    scanf("%d",&N);
    if(N<10000)
    {
     for(i=2;i<=9999;i=i+N)
    {

        printf("%d\n",i);
    }
    }
    return 0;
}
