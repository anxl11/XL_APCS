import java.util.Scanner;
public class FizzBuzzWhileLoop{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a positive integer: ");
        int numm = scan.nextInt();
        int num = 1;
        while(num<=numm){
            if (num%3!=0 && num%5 !=0){
                System.out.println(num);
                num++;
            }
            else if (num%3==0 && num%5 !=0){
                System.out.println("fizz");
                num++;
            }
            else if (num%3!=0 && num%5 ==0){
                System.out.println("buzz");
                num++;
            }
            else if (num%3==0 && num%5 ==0){
                System.out.println("fizzbuzz");
                num++;
            }
        }
    }
}