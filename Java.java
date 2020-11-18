import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int N = input.nextInt();
    int i;
    if(N<10000)
    {
     for(i=2;i<=9999;i=i+N)
    {

        System.out.println(i);
    }
    }
}
}
