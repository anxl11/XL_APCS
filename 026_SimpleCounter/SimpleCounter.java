import java.util.Scanner;
public class SimpleCounter{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your positive integer:");
        //prompts user to input
        int n = scan.nextInt();
        int b = 0;
        // conditions for operation
        while (n>b){
            System.out.println(b);
            b++;
        }
        System.out.println(n);

    }
}