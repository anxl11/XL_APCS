import java.util.Scanner;
public class SimpleCounter{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your positive integer:");
        int n = scan.nextInt();
        int b = 0;
        while (n>b){
            System.out.println(b);
            b++;
        }
        System.out.println(n);

    }
}