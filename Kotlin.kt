import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`);
    var N = input.nextInt();
    var i:Int;
    if(N<10000)
    {
        for(i in 2..9999 step N)
        {
            System.out.println(i);
        }
    }
}

