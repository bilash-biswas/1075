using System.IO;
using System;

class Program
{
    static void Main()
    {
    int i,N;
    N=Convert.ToInt32(Console.ReadLine());
    if(N<10000)
    {
     for(i=2;i<=9999;i=i+N)
    {

        Console.WriteLine(i);
    }
    }
    }
}
